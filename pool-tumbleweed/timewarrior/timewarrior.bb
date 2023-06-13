SUMMARY = "Command line time tracker"
DESCRIPTION = "Timewarrior is a command line time tracking application, which allows you to \
record time spent on activities."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "timewarrior-1.5.0-1.1.aarch64.rpm"
RPM_HASH = "bcbe6a915fda474f9db88b5c1c7dfc4708ce674c521ee978331615dff4e0b8f5ed1b870ddfba5a036946f4a13beb64b0a7c49a10a6111244f1b1bf9956dffa5b"

RPROVIDES:${PN} += "timewarrior \
timewarrior(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
