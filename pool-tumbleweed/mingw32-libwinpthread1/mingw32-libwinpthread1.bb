SUMMARY = "A pthreads implementation for Windows"
DESCRIPTION = "mingw-w64's implementation of POSIX threads for Windows."
LICENSE = "BSD-3-Clause & MIT"

PV = "10.0.0"

RPM_NAME = "mingw32-libwinpthread1-10.0.0-1.8.noarch.rpm"
RPM_HASH = "bb7646a7616ff5bcf0045afbc6d68206b710dec0ac525da7a843d6b7c19c57f5962b0861d0b402ebac58c9de8fc31979d656d9b34d5e76c29ee645279b3bdc25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libwinpthread-1.dll \
mingw32-libwinpthread1"

RDEPENDS:${PN} += ""

inherit rpm
