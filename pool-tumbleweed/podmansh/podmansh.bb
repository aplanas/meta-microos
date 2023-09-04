SUMMARY = "Confined login and user shell using podman"
DESCRIPTION = "podmansh provides a confined login and user shell with access to volumes and \
capabilities specified in user quadlets. \
 \
It is a symlink to /usr/bin/podman and execs into the `podmansh` container \
when `/usr/bin/podmansh is set as a login shell or set as os.Args[0]."
LICENSE = "Apache-2.0"

PV = "4.6.1"

RPM_NAME = "podmansh-4.6.1-2.1.aarch64.rpm"
RPM_HASH = "685f5f1e1e4bbc238ef762091967c6eb706a87bed5e14196090b65943dc4c5b64c8575edcd3fe7da339a50cd01da6fa2a4490bc71369cb4510477b10e30e390e"

RPROVIDES:${PN} += "podman-podmansh \
podman-shell \
podmansh"

RDEPENDS:${PN} += "podman"

inherit rpm
