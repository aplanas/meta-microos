SUMMARY = "Daemon-less container engine for managing containers, pods and images"
DESCRIPTION = "Podman is a container engine for managing pods, containers, and container \
images. \
It is a standalone tool and it directly manipulates containers without the need \
of a container engine daemon. \
Podman is able to interact with container images create in buildah, cri-o, and \
skopeo, as they all share the same datastore backend."
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "podman-4.5.1-1.1.aarch64.rpm"
RPM_HASH = "90884e902af095a625df0e2b75180caee8218e154f36a526c6cf919f2f3e8a6b140905035b0b5465383a163cd24e7e0eb29e981a609f2ee9ae61717e88d05c06"

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
