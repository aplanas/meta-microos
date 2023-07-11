SUMMARY = "Docker-compatible CLI for containerd"
DESCRIPTION = "nerdctl is a Docker-compatible CLI for containerd."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "nerdctl-1.4.0-1.2.aarch64.rpm"
RPM_HASH = "3b44e048b9fc8566fe860feb6a7149a27a53cd78e08bfb58fe4fe32d0dec3f18ad02ad432687820547d35e8723a0db096ff6b634575f2ebdc9b716bddc036d9f"

RPROVIDES:${PN} += "nerdctl"

RDEPENDS:${PN} += "/usr/bin/sh \
buildkit \
cni-plugins \
containerd \
iptables \
libc.so.6 \
rootlesskit \
slirp4netns"

inherit rpm
