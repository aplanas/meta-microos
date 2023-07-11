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

RPM_NAME = "luvcview-20070512-27.34.aarch64.rpm"
RPM_HASH = "c722233ec3c215e80ae5a64bdd6a2594f0ba125f0cec9934360805f6770444715f0f97e73e1bafb52e00cbab062f10a215645e33929359225f7dc333a5b1d0ba"

RPROVIDES:${PN} += "luvcview"

RDEPENDS:${PN} += "libSDL-1.2.so.0 \
libc.so.6"

inherit rpm
