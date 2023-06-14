SUMMARY = "Collection of software supporting LMS7-based hardware"
DESCRIPTION = "Lime Suite is a collection of software supporting several hardware \
platforms including the LimeSDR, drivers for the LMS7002M transceiver \
RFIC, and other tools for developing with LMS7-based hardware. Lime \
Suite enables many SDR applications, such as GQRX for example, to \
work with supported hardware through the bundled SoapySDR support \
module."
LICENSE = "Apache-2.0"

PV = "22.09.1"

RPM_NAME = "limesuite-22.09.1-2.2.aarch64.rpm"
RPM_HASH = "297b31740a3f399e59a2c22a7a83570606b1f02105791e02fb3db66855771eeb8d4aed79741b2e340fb4836c57ee27c9f2953747a3b92173f302b349689b332f"

RPROVIDES:${PN} += "limesuite"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libLimeSuite.so.22.09-1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwx-gtk3u-gl-suse.so.9.0.0"

inherit rpm
