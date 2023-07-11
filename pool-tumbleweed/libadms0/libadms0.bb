SUMMARY = "An automatic device model synthesizer"
DESCRIPTION = "ADMS is a code generator that converts electrical compact device models \
specified in high-level description language into ready-to-compile C code \
for the API of SPICE simulators. Based on transformations specified in XML \
language, ADMS transforms Verilog-AMS code into other target languages. \
 \
This package contains the libadms shared libraries."
LICENSE = "GPL-3.0-only"

PV = "2.3.7"

RPM_NAME = "libadms0-2.3.7-1.11.aarch64.rpm"
RPM_HASH = "41737c0d57e5d293527cfe7062f8bc200027fe1b654a96d389b424195c1796213aafbf15f7fed2a765941d3892cd66458ddf0c109376ebd4d6c5907934816bb3"

RPROVIDES:${PN} += "libadms0 \
libadmsAdmstpath.so.0 \
libadmsElement.so.0 \
libadmsPreprocessor.so.0 \
libadmsVeriloga.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
