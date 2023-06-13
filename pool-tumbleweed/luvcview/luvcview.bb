SUMMARY = "Simple V4L2 application using sdl"
DESCRIPTION = "luvcview is a simple V4L2 application using sdl \
 \
 \
 \
Authors: \
-------- \
    Laurent Pinchart \
    Michel Xhaard"
LICENSE = "GPL-2.0+"

PV = "20070512"

RPM_NAME = "luvcview-20070512-27.33.aarch64.rpm"
RPM_HASH = "09f999d7d5653be75b55cced7fd419b38cf59339e80d739a600fe2927622602e97250452c7fd836a91539104e5c4802db2dbc10785c09b66725694599c3b81c9"

RPROVIDES:${PN} += "luvcview \
luvcview(aarch-64)"

RDEPENDS:${PN} += "libSDL-1.2.so.0()(64bit) \
libc.so.6()(64bit)"

inherit rpm
