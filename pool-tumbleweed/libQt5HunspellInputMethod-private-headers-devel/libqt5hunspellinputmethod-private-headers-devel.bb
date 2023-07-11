SUMMARY = "Non-ABI stable API for libQt5HunspellInputMethod"
DESCRIPTION = "This package provides private headers of libQt5HunspellInputMethod that are \
normally not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "GPL-3.0"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5HunspellInputMethod-private-headers-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "fa9de8619928c6a2d1f7649ff46c3ae5fcfe949e9a42345071929393e5f736e25f007a84c80c2d3fab0aa19e61cf8a21bcb5f6ffe74a1ae8297f6c4551c9ded3"

RPROVIDES:${PN} += "cmake-Qt5HunspellInputMethod \
libQt5HunspellInputMethod-private-headers-devel"

RDEPENDS:${PN} += "libQt5HunspellInputMethod5 \
libqt5-qtvirtualkeyboard-private-headers-devel"

inherit rpm
