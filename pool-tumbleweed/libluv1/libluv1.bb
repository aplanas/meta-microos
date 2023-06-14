SUMMARY = "Lua bindings for libluv as a library"
DESCRIPTION = "This library makes libuv available to lua scripts. It was made \
for the luvit project but should usable from nearly any lua \
project."
LICENSE = "Apache-2.0"

PV = "1.43.0~0"

RPM_NAME = "libluv1-1.43.0~0-3.6.aarch64.rpm"
RPM_HASH = "79553158ddd4685e4e678ed065f899843c31ea37ce3fb24062ecd4a68ff2448a498841baa5dfdcf9b956eaace53b2f5ded3774364ab122f3ff4b3abf89867029"

RPROVIDES:${PN} += "libluv.so.1 \
libluv1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.1.so.5 \
libuv.so.1"

inherit rpm
