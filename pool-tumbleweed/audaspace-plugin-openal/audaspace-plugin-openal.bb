SUMMARY = "OpenAL plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the OpenAL plugin"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-plugin-openal-1.4.0-1.5.aarch64.rpm"
RPM_HASH = "ed3df1297a99cc0abf0a82c15a9b0406c9d7845579d49b9815d4c9d752465f901b3799d270e230478e306b280f22da5b0aa66ac28ec6e7365b078bf06c8224fc"

RPROVIDES:${PN} += "audaspace-deviceplugin \
audaspace-plugin-openal \
libaudopenal.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudaspace.so.1.4 \
libc.so.6 \
libgcc-s.so.1 \
libopenal.so.1 \
libstdc++.so.6"

inherit rpm
