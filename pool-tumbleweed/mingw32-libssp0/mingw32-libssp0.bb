SUMMARY = "MinGW Windows compiler for C shared libraries"
DESCRIPTION = "MinGW Windows compiler for C shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-libssp0-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "23bf94d23baa267e87184adeec12460fdcaff8aba2137573ab1d79f77397821f9d59fc595b89f470604c881ba9162b6b70034611f8c59a784644edd500880c58"

RPROVIDES:${PN} += "mingw32-libssp \
mingw32-libssp-0.dll \
mingw32-libssp0"

RDEPENDS:${PN} += ""

inherit rpm
