SUMMARY = "Microsoft Hyper-V tools"
DESCRIPTION = "This package contains the Microsoft Hyper-V tools."
LICENSE = "GPL-2.0-only"

PV = "8"

RPM_NAME = "hyper-v-8-2.11.aarch64.rpm"
RPM_HASH = "6d5f677e0ae2fffe111afe312e06a46a717407acbc1af31faca580a682541cacaca5b7fa9d63e5490481b0b7d1a0b9463b36c288461fafeef996a247c3dc8784"

RPROVIDES:${PN} += "hyper-v"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
