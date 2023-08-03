SUMMARY = "Daemon-less container engine for managing containers, pods and images"
DESCRIPTION = "Podman is a container engine for managing pods, containers, and container \
images. \
It is a standalone tool and it directly manipulates containers without the need \
of a container engine daemon. \
Podman is able to interact with container images create in buildah, cri-o, and \
skopeo, as they all share the same datastore backend."
LICENSE = "Apache-2.0"

PV = "4.6.0"

RPM_NAME = "podman-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "2dc7846579ea799bf320a945a2548bb94e7e59ae4f53575d2032f8f65abc7cab4dbf66039a0d51c5c9146e501175e98c74df9491ebcdcb7d259d31fe7fd1bb2a"

RPROVIDES:${PN} += "podman \
podman-cni-config"

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
