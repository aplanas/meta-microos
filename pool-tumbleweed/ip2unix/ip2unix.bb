SUMMARY = "Turn IP sockets into Unix domain sockets"
DESCRIPTION = "Executes a program and converts IP to Unix domain sockets at runtime based on a \
list of rules, either given via short command line options or via a file with a \
list of rules. The first matching rule causes ip2unix to replace the current IP \
socket with a Unix domain socket based on the options given. For example if a \
socketPath is specified, the Unix domain socket will bind or listen to the given \
path."
LICENSE = "LGPL-3.0-only"

PV = "2.1.4"

RPM_NAME = "ip2unix-2.1.4-4.1.aarch64.rpm"
RPM_HASH = "c08f01030a9c8a20c5356f7bbf42fd56070357ac66c34052e05e9bd2f2a0b622df425f234a5abc3bb3f13d3cbb7a49ac2c2ce7c684dee6c7105835ee93235b87"

RPROVIDES:${PN} += "ip2unix \
ip2unix(aarch-64) \
libip2unix.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libyaml-cpp.so.0.7()(64bit)"

inherit rpm
