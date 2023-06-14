SUMMARY = "Disposable Soft Synth Interface"
DESCRIPTION = "Disposable Soft Synth Interface (DSSI, pronounced 'dizzy') is a \
proposal for a plug-in API for software instruments (soft synths) with \
user interfaces, permitting them to be hosted in-process by Linux audio \
applications. Think of it as LADSPA-for-instruments or something \
comparable to a simpler version of VSTi."
LICENSE = "GPL-2.0+ & LGPL-2.1+ & SUSE-Public-Domain"

PV = "1.1.1"

RPM_NAME = "dssi-1.1.1-11.27.aarch64.rpm"
RPM_HASH = "34af0160cf930962f3ab1c2ae45d7fe96e11da3881a55dc8a867be4570e6b87fa416f27314dd92a3d37dca39182c432c08c37f042fbd7399fc6bc92485773481"

RPROVIDES:${PN} += "dssi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
liblo.so.7 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
