SUMMARY = "Dynamic display configuration"
DESCRIPTION = "kanshi allows you to define output profiles that are automatically enabled \
and disabled on hotplug."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "kanshi-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "644bfa207365666e8409ad8685be68bf49bf3fe9d85cfb3d870d3ae3399320cbfe1466b309b5d20749f502befa82a51f94e9a33bbdc1a723ac64394fca0c5cda"

RPROVIDES:${PN} += "kanshi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0"

inherit rpm
