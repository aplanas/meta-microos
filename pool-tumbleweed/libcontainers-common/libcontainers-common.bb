SUMMARY = "Configuration files common to github.com/containers"
DESCRIPTION = "Configuration files and manpages shared by tools that are based on the \
github.com/containers libraries, such as Buildah, CRI-O, Podman and Skopeo."
LICENSE = "Apache-2.0"

PV = "20230214"

RPM_NAME = "libcontainers-common-20230214-8.1.noarch.rpm"
RPM_HASH = "2e8893e9ad31269524b180996760ab128bce3b3523f98e04a1417b9ba3b4fe1655e5f741a99ec356ccd6cb1ab61c6bae9132c98f429843990995c01886630304"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libcontainers-common \
libcontainers-common \
libcontainers-image \
libcontainers-storage"

RDEPENDS:${PN} += "/usr/bin/sed \
/usr/bin/sh \
libcontainers-policy"

inherit rpm
