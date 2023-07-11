SUMMARY = "Standalone OCI Container Daemon"
DESCRIPTION = "Containerd is a daemon with an API and a command line client, to manage \
containers on one machine. It uses runC to run containers according to the OCI \
specification. Containerd has advanced features such as seccomp and user \
namespace support as well as checkpoint and restore for cloning and live \
migration of containers."
LICENSE = "Apache-2.0"

PV = "1.6.21"

RPM_NAME = "containerd-1.6.21-1.2.aarch64.rpm"
RPM_HASH = "81f4c6a89d9e23deae951163663808360e6f38084a78e8ff5aa231bf8a319c3a33372ffaa381ceb5da68ed67ddb6d25456c0122de695250ad179cf5e7f33c3b1"

RPROVIDES:${PN} += "config-containerd \
containerd \
containerd-git \
containerd-kubic"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
libc.so.6 \
runc"

inherit rpm
