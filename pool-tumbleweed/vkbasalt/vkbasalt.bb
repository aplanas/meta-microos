SUMMARY = "Vulkan post processing layer"
DESCRIPTION = "vkBasalt is a Vulkan post processing layer to enhance the visual graphics of games."
LICENSE = "Zlib"

PV = "0.3.2.9"

RPM_NAME = "vkbasalt-0.3.2.9-1.2.aarch64.rpm"
RPM_HASH = "fd2f9d644acc92ef93efd6a71b81dd718998a4c4d5795d881806d6289050ba38a8f31d835f311d5e97790f02a0459d814edf9e71b081020604c68409925a9adb"

RPROVIDES:${PN} += "config-vkbasalt \
libvkbasalt.so \
vkbasalt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
