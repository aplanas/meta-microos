SUMMARY = "Single header C++ logging library"
DESCRIPTION = "Single header C++ logging library. It is thread-aware and type safe, \
it provides ability to write logs in a customized format, and support \
for logging classes, third-party libraries, STL and third-party \
containers."
LICENSE = "MIT"

PV = "9.97.0"

RPM_NAME = "easyloggingpp-devel-9.97.0-1.7.aarch64.rpm"
RPM_HASH = "da120888305ccb36cb8c5eaff0826612a00ede8f8b2681412e9d5cb3c7067605fc5388bed87e7c0f200c5b4676d813d8c2af0876b40848c617bdf75121f843e9"

RPROVIDES:${PN} += "easyloggingpp-devel easyloggingpp-devel(aarch-64) pkgconfig(easyloggingpp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
