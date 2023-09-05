SUMMARY = "Daemon-less container engine for managing containers, pods and images"
DESCRIPTION = "Podman is a container engine for managing pods, containers, and container \
images. \
It is a standalone tool and it directly manipulates containers without the need \
of a container engine daemon. \
Podman is able to interact with container images create in buildah, cri-o, and \
skopeo, as they all share the same datastore backend."
LICENSE = "Apache-2.0"

PV = "4.6.2"

RPM_NAME = "podman-4.6.2-1.1.aarch64.rpm"
RPM_HASH = "2b9472424deb76958021f640e199ad0acfd4222de8b7e72a113ac83286d9e8b59a5d3cbd3480e97178b6beded1937450837eee96ab9ab12c019d7400f8ca276f"

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
