SUMMARY = "A Monitoring and Testing Tool for Linux kernel thermal subsystem"
DESCRIPTION = "This tool is conceived as a tool to help visualize, tune, and test the \
complex thermal subsystem."
LICENSE = "GPL-2.0-only"

PV = "1.0.gb61442df748f06e9"

RPM_NAME = "tmon-1.0.gb61442df748f06e9-1.7.aarch64.rpm"
RPM_HASH = "82116f07d49bb2090364e16044e177dfe51f8a747eb039dc4441e9dd553837c192e1c42d133b237fb59765d2c8d474e26045478183f10bd4dc8a946d8c4871ed"

RPROVIDES:${PN} += "tmon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6"

inherit rpm
