SUMMARY = "Font dumper for X font server"
DESCRIPTION = "showfont displays data about a font from an X font server. \
The information shown includes font information, font properties, \
character metrics, and character bitmaps."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "showfont-1.0.6-1.3.aarch64.rpm"
RPM_HASH = "0e819b8e980348a43d4066a1fd8d91cf3213bb291741fc6c210725ce72bd20269e3549840c0950abbdd430e023a2d717d5fa674a3f9729adae744067b8cede6b"

RPROVIDES:${PN} += "showfont"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFS.so.6 \
libc.so.6"

inherit rpm
