SUMMARY = "An automatic device model synthesizer"
DESCRIPTION = "ADMS is a code generator that converts electrical compact device models \
specified in high-level description language into ready-to-compile C code \
for the API of SPICE simulators. Based on transformations specified in XML \
language, ADMS transforms Verilog-AMS code into other target languages."
LICENSE = "GPL-3.0-only"

PV = "2.3.7"

RPM_NAME = "adms-2.3.7-1.11.aarch64.rpm"
RPM_HASH = "a97798970eeb273d67336d6fc6f7c02e15b46c79b5039d10789eb2fafeafec1d4258b29f13d8a57873369bd549594a4f45bd3cbda04b94b25cc5053af1714a75"

RPROVIDES:${PN} += "adms"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadmsAdmstpath.so.0 \
libadmsElement.so.0 \
libadmsPreprocessor.so.0 \
libadmsVeriloga.so.0 \
libc.so.6"

inherit rpm
