SUMMARY = "Greatly simplifies the integration of C/C++ code with Lua"
DESCRIPTION = "tolua is a tool that greatly simplifies the integration of \
C/C++ code with Lua. \
 \
Based on a 'cleaned' header file, tolua automatically generates \
the binding code to access C/C++ features from Lua. \
 \
Using Lua-5.0 API and tag method facilities, the current version \
automatically maps C/C++ constants, external variables, functions, \
namespace, classes, and methods to Lua. It also provides \
facilities to create Lua modules."
LICENSE = "GPL-2.0+"

PV = "5.2.4"

RPM_NAME = "tolua-5.2.4-4.3.aarch64.rpm"
RPM_HASH = "0b9820e839600e3d485dcc4a5f1b40237e127ecf9cfb1440e478f1f0216b2d6600b1ef111867a288c6e6a1222ea39a96f01aa85e310cdc1e3bcf4907e8739f4b"

RPROVIDES:${PN} += "tolua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
libtolua5"

inherit rpm
