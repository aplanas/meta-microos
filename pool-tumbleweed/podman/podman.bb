SUMMARY = "Daemon-less container engine for managing containers, pods and images"
DESCRIPTION = "Podman is a container engine for managing pods, containers, and container \
images. \
It is a standalone tool and it directly manipulates containers without the need \
of a container engine daemon. \
Podman is able to interact with container images create in buildah, cri-o, and \
skopeo, as they all share the same datastore backend."
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "podman-4.5.1-2.1.aarch64.rpm"
RPM_HASH = "12604f498336a51982b28dbd86c1952d599a5f4887bda560b209de1d951bc4e6f2b34dffb159d5d66a5181a1cbfc0b18ae44376727fc19eba6fb445b049bed23"

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
