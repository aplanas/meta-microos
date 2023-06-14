SUMMARY = "Vulkan post processing layer"
DESCRIPTION = "vkBasalt is a Vulkan post processing layer to enhance the visual graphics of games."
LICENSE = "Zlib"

PV = "0.3.2.9"

RPM_NAME = "vkbasalt-0.3.2.9-1.1.aarch64.rpm"
RPM_HASH = "f3a7cfa0d85fefa7c540a237585c280156396db802a9c17de9a69fd238d9d8c8450293e14bde014918b05b788d9723241caf192fd86e14bf02111ec8ebcfe689"

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
