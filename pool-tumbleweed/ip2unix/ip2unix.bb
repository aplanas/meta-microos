SUMMARY = "Turn IP sockets into Unix domain sockets"
DESCRIPTION = "Executes a program and converts IP to Unix domain sockets at runtime based on a \
list of rules, either given via short command line options or via a file with a \
list of rules. The first matching rule causes ip2unix to replace the current IP \
socket with a Unix domain socket based on the options given. For example if a \
socketPath is specified, the Unix domain socket will bind or listen to the given \
path."
LICENSE = "LGPL-3.0-only"

PV = "2.1.4"

RPM_NAME = "ip2unix-2.1.4-4.2.aarch64.rpm"
RPM_HASH = "070ed1ada1df6de19545d88aca09badfc9c4c00b5e2e96a1f5dae4b7f2370e8adc4b3d60673db2812b82f23a52ab53a887578fb7aeb81028324418d5d162ce35"

RPROVIDES:${PN} += "ip2unix \
libip2unix.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libyaml-cpp.so.0.7"

inherit rpm
