SUMMARY = "MinGW Windows compiler for C shared libraries"
DESCRIPTION = "MinGW Windows compiler for C shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-libssp0-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "fc97e0fdc4c51d6b97de6b93f674875f3557080268362ad1f8673bd808fe2e63c2681709663a8887dfeaa6323231e124e9e573ab5939b911a29aa419f006bf77"

RPROVIDES:${PN} += "mingw64-libssp \
mingw64-libssp-0.dll \
mingw64-libssp0"

RDEPENDS:${PN} += ""

inherit rpm
