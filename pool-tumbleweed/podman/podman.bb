SUMMARY = "Daemon-less container engine for managing containers, pods and images"
DESCRIPTION = "Podman is a container engine for managing pods, containers, and container \
images. \
It is a standalone tool and it directly manipulates containers without the need \
of a container engine daemon. \
Podman is able to interact with container images create in buildah, cri-o, and \
skopeo, as they all share the same datastore backend."
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "podman-4.5.1-1.2.aarch64.rpm"
RPM_HASH = "57d2bba757651a0bdba997d94aec7ce233067ccf3b4f3218427c69720e90c7e938cf24fedb00bef89ec33be8d00774053a65d91f657661af21d3792ad1f43fc4"

RPROVIDES:${PN} += "podman"

RDEPENDS:${PN} += "/usr/bin/sh \
catatonit \
cni \
cni-plugins \
conmon \
fuse-overlayfs \
iptables \
libc.so.6 \
libcontainers-common \
libgpgme.so.11 \
libseccomp.so.2 \
runc \
slirp4netns \
timezone"

inherit rpm
