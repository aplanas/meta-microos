SUMMARY = "LibRCC Runtime Environment"
DESCRIPTION = "Runtime environment for the LibRCC package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.13"

RPM_NAME = "rcc-runtime-0.2.13-1.4.aarch64.rpm"
RPM_HASH = "4ea659c914b4e2457d1e356890298e41130be8625d4699423ec9079f5e9686fcf3b3cb1caba7b8f4271df6f81d7453ecd53c7cd5f5feb3cad9852ba08764e4e8"

RPROVIDES:${PN} += "config-rcc-runtime \
libguess-engine.so \
librcd-engine.so \
rcc-runtime"

RDEPENDS:${PN} += "libc.so.6 \
libguess.so.1 \
librcc.so.0 \
librcd.so.0"

inherit rpm
