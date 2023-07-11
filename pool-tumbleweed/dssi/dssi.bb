SUMMARY = "Disposable Soft Synth Interface"
DESCRIPTION = "Disposable Soft Synth Interface (DSSI, pronounced 'dizzy') is a \
proposal for a plug-in API for software instruments (soft synths) with \
user interfaces, permitting them to be hosted in-process by Linux audio \
applications. Think of it as LADSPA-for-instruments or something \
comparable to a simpler version of VSTi."
LICENSE = "GPL-2.0+ & LGPL-2.1+ & SUSE-Public-Domain"

PV = "1.1.1"

RPM_NAME = "dssi-1.1.1-11.28.aarch64.rpm"
RPM_HASH = "4e836ff93d308b034b0cadb55727aabc4182aa75cdd0978bfd1b45e4785bd668f43e8df7ac9c6a62b4d5a20db366a9625a07a845bf3d005be01b2e871eb867a2"

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
