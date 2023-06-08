SUMMARY = "Standalone OCI Container Daemon"
DESCRIPTION = "Containerd is a daemon with an API and a command line client, to manage \
containers on one machine. It uses runC to run containers according to the OCI \
specification. Containerd has advanced features such as seccomp and user \
namespace support as well as checkpoint and restore for cloning and live \
migration of containers."
LICENSE = "Apache-2.0"

PV = "1.6.20"

RPM_NAME = "containerd-1.6.20-1.1.aarch64.rpm"
RPM_HASH = "ce60ac1da2886412515cba3c4866654cd1ea9d5c8c640bd0213b1d11c5bea84ee2934fa965e8eb86838d3322b1c6fd1617a091ad13a35672f54aa8bf36b13442"

RPROVIDES:${PN} += "config(containerd) containerd containerd(aarch-64) containerd-git containerd-kubic"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup libc.so.6(GLIBC_2.34)(64bit) runc"

inherit rpm
