SUMMARY = "Turn IP sockets into Unix domain sockets"
DESCRIPTION = "Executes a program and converts IP to Unix domain sockets at runtime based on a \
list of rules, either given via short command line options or via a file with a \
list of rules. The first matching rule causes ip2unix to replace the current IP \
socket with a Unix domain socket based on the options given. For example if a \
socketPath is specified, the Unix domain socket will bind or listen to the given \
path."
LICENSE = "LGPL-3.0-only"

PV = "2.2.1"

RPM_NAME = "ip2unix-2.2.1-1.1.aarch64.rpm"
RPM_HASH = "91673daa0030ea039e89da883d5bc7de8740cb434c651638f12e0e5a07ffcf86767d7eaa5ea947d044adab80fa77e0e9a7f233e2f06d8f232768673a6845b4cb"

RPROVIDES:${PN} += "ip2unix \
libip2unix.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libyaml-cpp.so.0.8"

inherit rpm
