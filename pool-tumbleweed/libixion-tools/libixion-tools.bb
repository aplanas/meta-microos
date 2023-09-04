SUMMARY = "Spreadsheet file processing library"
DESCRIPTION = "Tools to use ixion parser and interpreter from cli."
LICENSE = "MIT"

PV = "0.18.1"

RPM_NAME = "libixion-tools-0.18.1-1.1.aarch64.rpm"
RPM_HASH = "e90e54e7c56d4b5f2fa5094ff8174dc5ed262cccc14eeb2954018137736712be3ed8da1f177708bc9fd63f1e2e33b7e75c0dddf94e09299822305850db2f3f49"

RPROVIDES:${PN} += "libixion-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libboost-system.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libixion-0-18-0 \
libixion-0.18.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
