SUMMARY = "Development files for libtidy"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications using functions provided by the TidyLib library."
LICENSE = "W3C"

PV = "5.8.0"

RPM_NAME = "libtidy-devel-5.8.0-1.8.aarch64.rpm"
RPM_HASH = "3b5f95095a1bb87dbb2e9a74b209902d8b9bdd88ab0924c95c8126a94f2211229f3467cda8dfc4b7607fef675de19b50bd651b30b223d9b9356b9a24b28a28a9"

RPROVIDES:${PN} += "libtidy-devel \
libtidy-devel(aarch-64) \
pkgconfig(tidy)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libtidy58"

inherit rpm
