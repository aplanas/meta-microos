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

RPM_NAME = "perl-MouseX-ConfigFromFile-0.05-4.19.noarch.rpm"
RPM_HASH = "508a38ba551fcd829dc90d1560669fb432df8deb215961eb8f6489847c3231b7758fe8a9da5c2ca69207246eb7d90f5bf9f892d7edae450a75634621fc3f37af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MouseX--ConfigFromFile \
perl-MouseX-ConfigFromFile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Mouse \
perl-MouseX--Types--Path--Class"

inherit rpm
