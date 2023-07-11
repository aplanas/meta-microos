SUMMARY = "PLplot functions for scientific plotting with Lua"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the PLplot functions required for scientific \
plotting with Lua."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-lua-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "4973f1032383f897ae15b798390835f5c5bd7829f7a96f0fec4136626acb98ffcc2accf2dc3b7886838428e3479da063a39545fde6a19a43928c3dd3dbc52f86"

RPROVIDES:${PN} += "plplot-lua"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
libplplot.so.17 \
lua \
plplot-common"

inherit rpm
