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

RPM_NAME = "tolua-5.2.4-4.2.aarch64.rpm"
RPM_HASH = "380519ca479dd531c4be3657d96ba5d14732ace24b6dafd3d926a0b10de1aa05acf29234c0f4ebb9cc211c7230ef0d03b2fbf0a7a093a9153719c30a1d650830"

RPROVIDES:${PN} += "tolua \
tolua(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblua5.4.so.5()(64bit) \
libtolua5"

inherit rpm
