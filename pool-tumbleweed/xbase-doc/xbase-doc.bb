SUMMARY = "Developer documentation for XBase Compatible C++ Class Library"
DESCRIPTION = "Developer documentation for XBase (dBase and FoxPro, for example) \
compatible C++ class library. \
 \
This package contains header files, a library, some command line tools, \
and developer documentation."
LICENSE = "LGPL-2.1+"

PV = "3.1.2"

RPM_NAME = "xbase-doc-3.1.2-1.24.aarch64.rpm"
RPM_HASH = "94ff00065097d8728a90430922a81275b7b098b55a61b68a0f3f7cda62c0510e2d0c2c44a79f0526c97821d44ad113be07f4bad35e389ef18a8a1e2ce8afdb75"

RPROVIDES:${PN} += "xbase-/usr/share/doc/packages/xbase-doc/html/classes.html \
xbase-doc"

RDEPENDS:${PN} += "xbase"

inherit rpm
