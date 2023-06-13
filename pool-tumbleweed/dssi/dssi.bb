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

RPROVIDES:${PN} += "dssi \
dssi(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjack.so.0()(64bit) \
liblo.so.7()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
