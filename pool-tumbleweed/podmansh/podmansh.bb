SUMMARY = "Confined login and user shell using podman"
DESCRIPTION = "podmansh provides a confined login and user shell with access to volumes and \
capabilities specified in user quadlets. \
 \
It is a symlink to /usr/bin/podman and execs into the `podmansh` container \
when `/usr/bin/podmansh is set as a login shell or set as os.Args[0]."
LICENSE = "Apache-2.0"

PV = "4.6.0"

RPM_NAME = "podmansh-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "f66a647aa47fce3b2efa9d5f6fae6150567e84e01e58ad7d74ce6b8a07bec4ceda4437ca59f5e3bedd2b9f640ffb9e635f87f2f861c61accac4299b3f17a7b94"

RPROVIDES:${PN} += "podman-podmansh \
podman-shell \
podmansh"

RDEPENDS:${PN} += "podman"

inherit rpm
