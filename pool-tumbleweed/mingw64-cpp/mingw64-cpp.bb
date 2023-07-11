SUMMARY = "MinGW Windows C Preprocessor"
DESCRIPTION = "MinGW Windows C Preprocessor"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-cpp-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "39e679fe44a2d0aa68102c9739960d39ce451b5a3829d355c82fe65deeb9b66b1823d540a4b5e727f1bf4b4c34af25fbf8536e933298c48803ac839ba33556be"

RPROVIDES:${PN} += "mingw64-cpp"

RDEPENDS:${PN} += "mingw64-libgmp-10.dll \
mingw64-libmpc-3.dll \
mingw64-libmpfr-4.dll \
mingw64-libwinpthread-1.dll \
mingw64-libz.dll"

inherit rpm
