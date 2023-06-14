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

RPM_NAME = "perl-MouseX-ConfigFromFile-0.05-4.17.noarch.rpm"
RPM_HASH = "3d9ddcaf89d682927d9fa3ade2a7c54c46255ea45262d2e30a72599c0f16d9468ccfe01717129dd67be2f05e3d8769b2e0c19d5080d51e3eaf11fc2436ee45b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MouseX--ConfigFromFile \
perl-MouseX-ConfigFromFile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Mouse \
perl-MouseX--Types--Path--Class"

inherit rpm
