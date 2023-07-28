SUMMARY = "Compile and install Ruby"
DESCRIPTION = "ruby-build provides a simple way to compile and install different versions of Ruby on UNIX-like systems."
LICENSE = "MIT"

PV = "20230717"

RPM_NAME = "ruby-build-20230717-1.1.noarch.rpm"
RPM_HASH = "50ebca9d1c4122c4e297757ac85eed98a6b7f7166c9f7663186f33ffb6b65122c4f5a00e6c8e9275a2e4b380097bd0618b6b47641976723b9d65441832ebdd30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
curl \
gzip \
make \
tar"

inherit rpm
