SUMMARY = "Collection of software supporting LMS7-based hardware"
DESCRIPTION = "Lime Suite is a collection of software supporting several hardware \
platforms including the LimeSDR, drivers for the LMS7002M transceiver \
RFIC, and other tools for developing with LMS7-based hardware. Lime \
Suite enables many SDR applications, such as GQRX for example, to \
work with supported hardware through the bundled SoapySDR support \
module."
LICENSE = "Apache-2.0"

PV = "22.09.1"

RPM_NAME = "limesuite-22.09.1-2.3.aarch64.rpm"
RPM_HASH = "145efbf3dd15864d2c9ef16d25b2df0994b0e2332dff8ddadc2e4518beffb2eae50bfd69253cd71cdad55c1814b0b98abd4ae5d636ebc83fd0988bbf7a814cd5"

RPROVIDES:${PN} += "limesuite"

RDEPENDS:${PN} += "/usr/bin/bash \
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
