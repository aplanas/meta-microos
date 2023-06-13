SUMMARY = "Development files for occt"
DESCRIPTION = "This package contains the OpenCASCADE DRAWEXE test \
harness executable."
LICENSE = "LGPL-2.1-only-WITH-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "occt-DRAWEXE-7.7.0-1.3.aarch64.rpm"
RPM_HASH = "2c2541334dbcf1ea2de0bd0e0db491d34c7275ed5c4f3c0586ab50ea57232216992a855b9c76278f1f46cc419d7e58fdcbcfd2c6508f774adb02e5a4d18bd230"

RPROVIDES:${PN} += "occt-DRAWEXE \
occt-DRAWEXE(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
libTKDraw.so.7.7()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
