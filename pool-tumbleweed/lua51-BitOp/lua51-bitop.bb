SUMMARY = "Lua Bit Operations Module"
DESCRIPTION = "Lua BitOp is a C extension module for Lua 5.1/5.2 which adds bitwise operations \
on numbers."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "lua51-BitOp-1.0.2-6.2.aarch64.rpm"
RPM_HASH = "16e10d202ef30b040c25af9d4c8d3c63c12900860c50df24496f6897a5bf0b9220a939ccd259ab2d0c5dc84a0bb49460adb62a94912a7f797c54fc916c397401"

RPROVIDES:${PN} += "lua51-BitOp \
lua51-BitOp(aarch-64) \
lua51-BitOp-doc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
lua51"

inherit rpm
