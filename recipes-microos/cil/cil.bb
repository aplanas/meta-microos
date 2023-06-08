SUMMARY = "SELinux Common Intermediate Language compiler"
DESCRIPTION = "The SELinux Common Intermediate Language (CIL) is designed to be a language that sits between one or more high level \
policy languages (such as the current module language) and the low-level kernel policy representation. \
 \
This is a compiler for CIL."
LICENSE = "BSD-2-Clause"

PV = "3.5"

RPM_NAME = "cil-3.5-1.2.aarch64.rpm"
RPM_HASH = "400e9f52fc83668fb460639bcec413c575ad80c6b2935c11f7834cf011e6f5f3eaf68bfde66cf3da22b6f59aa866b87efae58aeca396fe5326301d251e7876ca"

RPROVIDES:${PN} += "cil cil(aarch-64) cil-doc"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libsepol.so.2()(64bit) libsepol.so.2(LIBSEPOL_1.0)(64bit) libsepol.so.2(LIBSEPOL_1.1)(64bit) libsepol.so.2(LIBSEPOL_3.0)(64bit)"

inherit rpm
