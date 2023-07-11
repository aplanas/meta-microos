SUMMARY = "Command line time tracker"
DESCRIPTION = "Timewarrior is a command line time tracking application, which allows you to \
record time spent on activities."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "timewarrior-1.5.0-1.2.aarch64.rpm"
RPM_HASH = "8f5f82ca4e96aa7fd8bd55bb34b9f63d786dbc73ecb68ee904345371551c3331edaae73dbcafbef9130e9a3956185bceebc8479a19ac06c205a9f9733598b882"

RPROVIDES:${PN} += "timewarrior"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
