SUMMARY = "The libmpd package"
DESCRIPTION = "libmpd is a library that provides high-level, callback-based access to Music \
Player Daemon."
LICENSE = "GPL-2.0+"

PV = "11.8.17"

RPM_NAME = "libmpd1-11.8.17-1.29.aarch64.rpm"
RPM_HASH = "8a90976ad6e6b4ab570fbf506dae19da8c51bae4d8596a0390887738fba005a73180fe9f8ff9477b73be311ccc7107830703d73d146bf570f5a4c0c8af4d2c2d"

RPROVIDES:${PN} += "libmpd.so.1 \
libmpd1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
