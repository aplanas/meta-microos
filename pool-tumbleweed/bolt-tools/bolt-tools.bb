SUMMARY = "Bolt Tools"
DESCRIPTION = "The bolt-tools package contains optional tools from the Bolt \
software framework."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.5"

RPM_NAME = "bolt-tools-0.9.5-1.3.aarch64.rpm"
RPM_HASH = "3b103134cd2dac4e24ca0d049f7445835d4cc8fd5dbd523e414fc7bb3c80c149338bb85fdf7e94df0a6157f9ba446b9fa58cf532b417d2796fd892b90c11ccd8"

RPROVIDES:${PN} += "bolt-tools"

RDEPENDS:${PN} += "bolt \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
