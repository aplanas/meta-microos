SUMMARY = "Working (Require 'Class::Name') and More"
DESCRIPTION = "'require EXPR' only accepts 'Class/Name.pm' style module names, not \
'Class::Name'. How frustrating! For that, we provide 'load_class \
'Class::Name''. \
 \
It's often useful to test whether a module can be loaded, instead of \
throwing an error when it's not available. For that, we provide \
'try_load_class 'Class::Name''. \
 \
Finally, sometimes we need to know whether a particular class has been \
loaded. Asking '%INC' is an option, but that will miss inner packages and \
any class for which the filename does not correspond to the package name. \
For that, we provide 'is_class_loaded 'Class::Name''."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.25"

RPM_NAME = "perl-Class-Load-0.25-1.18.noarch.rpm"
RPM_HASH = "9e53b683e9a819d0b973ab7572906cd21f4983fdc93ae7b45b6ef7d47987b8b561ae14463cecff893d58d85bc35c03b1ea8c0afa78934566278635decb3b848b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Load \
perl-Class--Load--PP \
perl-Class-Load"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Data--OptList \
perl-Module--Implementation \
perl-Module--Runtime \
perl-Package--Stash \
perl-Try--Tiny"

inherit rpm
