SUMMARY = "Cyrus SASL library for Lua 5.1+"
DESCRIPTION = "Provides Lua bindings for Cyrus SASL authentication library."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "lua51-cyrussasl-1.1.0-3.2.aarch64.rpm"
RPM_HASH = "102c7b192756ef70bbabf97613fbad3f04c7557b6d0d8fa5409152488a2c0215c910a27bd8b07bda633712bb87405666044e6167f7f03d58c589f0ecb74d118b"

RPROVIDES:${PN} += "lua51-cyrussasl \
lua51-cyrussasl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsasl2.so.3()(64bit) \
lua51"

inherit rpm
