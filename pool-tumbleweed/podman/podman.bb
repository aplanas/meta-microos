SUMMARY = "Daemon-less container engine for managing containers, pods and images"
DESCRIPTION = "Podman is a container engine for managing pods, containers, and container \
images. \
It is a standalone tool and it directly manipulates containers without the need \
of a container engine daemon. \
Podman is able to interact with container images create in buildah, cri-o, and \
skopeo, as they all share the same datastore backend."
LICENSE = "Apache-2.0"

PV = "4.6.1"

RPM_NAME = "podman-4.6.1-2.1.aarch64.rpm"
RPM_HASH = "bc7a30e7410f4d9a6a52c97fabff8a92129332ec58629ed29fcbe9b7e749b0912b583ebc69efc3ebff50549598d1e03b758bc7300e83f2c7d4a96beaf2e546a0"

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
