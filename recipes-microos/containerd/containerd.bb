SUMMARY = "Standalone OCI Container Daemon"
DESCRIPTION = "Containerd is a daemon with an API and a command line client, to manage \
containers on one machine. It uses runC to run containers according to the OCI \
specification. Containerd has advanced features such as seccomp and user \
namespace support as well as checkpoint and restore for cloning and live \
migration of containers."
LICENSE = "Apache-2.0"

PV = "1.6.21"

RPM_NAME = "containerd-1.6.21-1.1.aarch64.rpm"
RPM_HASH = "2b98e7311dc1520b1eb76380e815bb10872b81a2560466d070f7bbbc7d252f39cf6bcaf5e5a146680508503e073afdb92a91a931fe221a25262ee1b588a4562a"

RPROVIDES:${PN} += "config(containerd) containerd containerd(aarch-64) containerd-git containerd-kubic"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup libc.so.6(GLIBC_2.34)(64bit) runc"

inherit rpm
