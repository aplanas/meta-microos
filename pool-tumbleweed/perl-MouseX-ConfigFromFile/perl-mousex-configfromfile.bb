SUMMARY = "An abstract Mouse role for setting attributes from a configfile"
DESCRIPTION = "This is an abstract role which provides an alternate constructor for \
creating objects using parameters passed in from a configuration file. The \
actual implementation of reading the configuration file is left to concrete \
subroles. \
 \
It declares an attribute 'configfile' and a class method 'new_with_config', \
and requires that concrete roles derived from it implement the class method \
'get_config_from_file'. \
 \
Attributes specified directly as arguments to 'new_with_config' supercede \
those in the configfile."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-MouseX-ConfigFromFile-0.05-4.18.noarch.rpm"
RPM_HASH = "73ad1c58abcedfe691dd9b8af3d21e582c404d84e495938ed064345e55b1e997f04326c5eec06edafd3088c2a76ae9d7ae03935c8ba55bb24ef59061848e90d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MouseX--ConfigFromFile \
perl-MouseX-ConfigFromFile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Mouse \
perl-MouseX--Types--Path--Class"

inherit rpm
