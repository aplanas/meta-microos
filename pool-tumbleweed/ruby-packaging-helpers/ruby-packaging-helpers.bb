SUMMARY = "Ruby packaging helpers"
DESCRIPTION = "This package is needed for (generated) ruby gems. It provides hooks for \
automatic rpm provides and requires and macros that gem2rpm uses. \
 \
Some helper tools for packaging rubygems and rails apps."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "ruby-packaging-helpers-3.2.1-1.1.noarch.rpm"
RPM_HASH = "d94a2060148389ac84abe0c818b92e38a63505f7cfd7ed9517baade3132f3ccb74fb08f9aae33a52c901d868203699d006b6a7a558d42f3f10fd76f1e6f3d214"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-packaging-helpers"

RDEPENDS:${PN} += "/usr/bin/ruby \
ruby-common"

inherit rpm
