SUMMARY = "Userspace tools for TOMOYO Linux 2.4.x"
DESCRIPTION = "This package contains userspace tools for administrating TOMOYO Linux 2.4. \
Please see http://tomoyo.sourceforge.jp/2.4/ for documentation."
LICENSE = "GPL-2.0-only"

PV = "2.6.1.20210910"

RPM_NAME = "tomoyo-tools-2.6.1.20210910-1.9.aarch64.rpm"
RPM_HASH = "8d961bf52789caa7a4a58ed1f6e882593121a779b8473ead388bfdd1c8785b5726387d9af31faf71d56ce7ebef0938444c148045eaaf28896e2e24774d933cec"

RPROVIDES:${PN} += "libtomoyotools.so.3 \
tomoyo-tools"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
