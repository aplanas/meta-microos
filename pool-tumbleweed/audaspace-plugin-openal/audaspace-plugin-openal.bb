SUMMARY = "OpenAL plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the OpenAL plugin"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-plugin-openal-1.4.0-1.4.aarch64.rpm"
RPM_HASH = "fd8cd3d46b364939d5a2f57646284ae46254eae5b08ab21cecef63a707f87a740fdd2ae5106a3cad9f7ec9d6b9ad21312ecdf7d8b0fc6f27efd2a3b4888731b0"

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
