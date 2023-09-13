SUMMARY = "Compile and install Ruby"
DESCRIPTION = "ruby-build provides a simple way to compile and install different versions of Ruby on UNIX-like systems."
LICENSE = "MIT"

PV = "20230904"

RPM_NAME = "ruby-build-20230904-1.1.noarch.rpm"
RPM_HASH = "8a16247a003269c1e3598acbd0198ae17d0f6cc35597332aa286980c9bd1261ac1e6ac84a649637de506cd5f2d00259bb1e47c471313e6d3910dfcd5a33de426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
curl \
gzip \
make \
tar"

inherit rpm
