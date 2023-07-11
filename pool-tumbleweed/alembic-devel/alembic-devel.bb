SUMMARY = "Development files for alembic"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for alembic. If you would like to develop programs using alembic, \
you will need to install alembic-devel."
LICENSE = "BSD-3-Clause"

PV = "1.8.4"

RPM_NAME = "alembic-devel-1.8.4-2.1.aarch64.rpm"
RPM_HASH = "d02391b8d881d939b0e3ba59a7a15931c5f65a1a45069ba53828544b9b0ead7fa80a365213996386b9d73e39322ae1ad5124e28f6649e400897fba0d419ef9e8"

RPROVIDES:${PN} += "alembic-devel \
cmake-Alembic"

RDEPENDS:${PN} += "libAlembic1-8"

inherit rpm
