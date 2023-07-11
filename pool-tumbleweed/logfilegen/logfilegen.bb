SUMMARY = "Log file generator for server log files and user-defined formats"
DESCRIPTION = "Logfilegen is a tool to generate common server (nginx, etc) or user-defined \
format log files. It can generate log file with the desired rate (lines per \
second), the file size, lines count and the duration. Each variable of the log \
file can be redefined by the random or static value. The tool is designed to \
be fast and customizable."
LICENSE = "Unlicense"

PV = "3.0.3"

RPM_NAME = "logfilegen-3.0.3-1.2.aarch64.rpm"
RPM_HASH = "13e5e428f2233d3fbd37bade6e818bdff99206ddc7dcce89663330ff76edf04f17832320489451a0646d3d0d36497288b842c8116246462996a08872a0f619e9"

RPROVIDES:${PN} += "logfilegen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
