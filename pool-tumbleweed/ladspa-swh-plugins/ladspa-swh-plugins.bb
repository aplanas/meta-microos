SUMMARY = "LADSPA SWH plugins"
DESCRIPTION = "This package provides a collection of LADSPA (Linux Audio Developer's \
Simple Plug-in API) plugins written by Steve Harris."
LICENSE = "GPL-2.0+"

PV = "0.4.17"

RPM_NAME = "ladspa-swh-plugins-0.4.17-1.26.aarch64.rpm"
RPM_HASH = "91083f7be46407e852100713083fdcef116e7bd37f37ee443913f1465d80dc590999983b983533ed30d3fe41d4a360b9eb7c5846842c690d9e0a7f8fedbd8594"

RPROVIDES:${PN} += "ladspa-swh-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3 \
libm.so.6"

inherit rpm
