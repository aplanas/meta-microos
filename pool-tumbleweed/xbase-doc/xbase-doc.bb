SUMMARY = "Developer documentation for XBase Compatible C++ Class Library"
DESCRIPTION = "Developer documentation for XBase (dBase and FoxPro, for example) \
compatible C++ class library. \
 \
This package contains header files, a library, some command line tools, \
and developer documentation."
LICENSE = "LGPL-2.1+"

PV = "3.1.2"

RPM_NAME = "xbase-doc-3.1.2-1.23.aarch64.rpm"
RPM_HASH = "f6cd64ca1a186f48109a638e3a12c013941f41822802406f142a7c7549ca3365ca6ab44f81618f47275389cd248107f3f66eb5994f5f24f646caf588af816bf2"

RPROVIDES:${PN} += "xbase-/usr/share/doc/packages/xbase-doc/html/classes.html \
xbase-doc"

RDEPENDS:${PN} += "xbase"

inherit rpm
