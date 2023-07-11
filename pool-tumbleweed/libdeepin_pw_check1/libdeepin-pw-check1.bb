SUMMARY = "Deepin-pw-check libraries"
DESCRIPTION = "This package contains the libraries for IBus"
LICENSE = "GPL-3.0+"

PV = "5.1.16"

RPM_NAME = "libdeepin_pw_check1-5.1.16-1.6.aarch64.rpm"
RPM_HASH = "24be77994f0beeaa890b3be5de9684e9bf5a0cc9893b790e1639f193f6de9301204ec84e24a9771371aba9e6d02dd7a962f65577015015756bab66859f6d58e0"

RPROVIDES:${PN} += "libdeepin-pw-check.so.1 \
libdeepin-pw-check1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrack.so.2 \
libcrypt.so.1 \
libiniparser.so.1"

inherit rpm
