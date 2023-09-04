SUMMARY = "Docker-compatible CLI for containerd"
DESCRIPTION = "nerdctl is a Docker-compatible CLI for containerd."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "nerdctl-1.5.0-1.1.aarch64.rpm"
RPM_HASH = "0dcfe783135617ec3ab064537554127b813aa741e61aeb895aea36c74a068ec2ba30f1b6563c185e1a1b9a585f9a9a6f8e5e349f445c47db8cc8fc4ba4236904"

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
