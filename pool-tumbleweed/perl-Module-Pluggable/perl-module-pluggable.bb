SUMMARY = "Automatically Give Your Module the Ability to Have Plugins"
DESCRIPTION = "Provides a simple but, hopefully, extensible way of having 'plugins' for \
your module. Obviously this isn't going to be the be all and end all of \
solutions but it works for me. \
 \
Essentially all it does is export a method into your namespace that looks \
through a search path for .pm files and turn those into class names. \
 \
Optionally it instantiates those classes for you."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "5.2"

RPM_NAME = "perl-Module-Pluggable-5.2-1.27.noarch.rpm"
RPM_HASH = "9886f1af2cab32a12515992978613441d6591dd63f09fe5c604f5ad639d3e1945c9d1b13ba0edde0de60897aa217722626e4b6eb9b1287eb55e8149c465db940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--InnerPackage \
perl-Module--Pluggable \
perl-Module--Pluggable--Object \
perl-Module-Pluggable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
