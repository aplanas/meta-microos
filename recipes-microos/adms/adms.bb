SUMMARY = "An automatic device model synthesizer"
DESCRIPTION = "ADMS is a code generator that converts electrical compact device models \
specified in high-level description language into ready-to-compile C code \
for the API of SPICE simulators. Based on transformations specified in XML \
language, ADMS transforms Verilog-AMS code into other target languages."
LICENSE = "GPL-3.0-only"

PV = "2.3.7"

RPM_NAME = "adms-2.3.7-1.10.aarch64.rpm"
RPM_HASH = "026841973376228418b287cf18b41dc51bbafbedc29cc1ab268b10898f934e0838a7c554f113e716d6723ad65f0da23783ff3699742ef9545a69217769713a3a"

RPROVIDES:${PN} += "adms \
adms(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libadmsAdmstpath.so.0()(64bit) \
libadmsElement.so.0()(64bit) \
libadmsPreprocessor.so.0()(64bit) \
libadmsVeriloga.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
