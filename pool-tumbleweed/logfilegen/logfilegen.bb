SUMMARY = "Log file generator for server log files and user-defined formats"
DESCRIPTION = "Logfilegen is a tool to generate common server (nginx, etc) or user-defined \
format log files. It can generate log file with the desired rate (lines per \
second), the file size, lines count and the duration. Each variable of the log \
file can be redefined by the random or static value. The tool is designed to \
be fast and customizable."
LICENSE = "Unlicense"

PV = "3.0.3"

RPM_NAME = "logfilegen-3.0.3-1.1.aarch64.rpm"
RPM_HASH = "f6249f678e267c82c81a1a340835f2601ffb06f4d14867bbfaa9b5c9d446e11891899492cc146d8f81f42b693d70fb2eecb441fdf1dc28f5c974144e4f7a0c31"

RPROVIDES:${PN} += "logfilegen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
