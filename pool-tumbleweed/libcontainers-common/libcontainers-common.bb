SUMMARY = "Configuration files common to github.com/containers"
DESCRIPTION = "Configuration files and manpages shared by tools that are based on the \
github.com/containers libraries, such as Buildah, CRI-O, Podman and Skopeo."
LICENSE = "Apache-2.0"

PV = "20230214"

RPM_NAME = "libcontainers-common-20230214-7.1.noarch.rpm"
RPM_HASH = "bd402220290edde2e4cf6887074edcd66d7cce12aa6d92c04972de72811bba074129db890f68dfe780bd6d7803fba9628ec4f01f4312bdc670b1b1dcf4e9384a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libcontainers-common \
libcontainers-common \
libcontainers-image \
libcontainers-storage"

RDEPENDS:${PN} += "/usr/bin/sed \
/usr/bin/sh \
libcontainers-policy"

inherit rpm
