SUMMARY = "A small build system closest in spirit to Make"
DESCRIPTION = "Ninja is yet another build system. It takes as input the interdependencies \
of files (typically source code and output executables) and orchestrates \
building them, quickly."
LICENSE = "Apache-2.0"

PV = "1.11.1"

RPM_NAME = "ninja-1.11.1-1.3.aarch64.rpm"
RPM_HASH = "10877e4e430418a820c59a805a3785a9639316b21b319b02008fa3e0231f5e735991620ba39042ee7c0ac283d0c9cdecb79cc63e9962572df8b7a6f705b79a98"

RPROVIDES:${PN} += "ninja \
ninja(aarch-64) \
rpm_macro(ninja_build) \
rpm_macro(ninja_install) \
rpm_macro(ninja_test)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
