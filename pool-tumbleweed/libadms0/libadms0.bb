SUMMARY = "An automatic device model synthesizer"
DESCRIPTION = "ADMS is a code generator that converts electrical compact device models \
specified in high-level description language into ready-to-compile C code \
for the API of SPICE simulators. Based on transformations specified in XML \
language, ADMS transforms Verilog-AMS code into other target languages. \
 \
This package contains the libadms shared libraries."
LICENSE = "GPL-3.0-only"

PV = "2.3.7"

RPM_NAME = "libadms0-2.3.7-1.10.aarch64.rpm"
RPM_HASH = "7cafa5d3bbfa86af7fdae66575d76ff21daeef5f6d43844cd08ad5adf049373a973979f0cdf900a843bb42f2b81d3ba7f93e33728df4bacc9d07a13004ae203e"

RPROVIDES:${PN} += "libadms0 \
libadmsAdmstpath.so.0 \
libadmsElement.so.0 \
libadmsPreprocessor.so.0 \
libadmsVeriloga.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
