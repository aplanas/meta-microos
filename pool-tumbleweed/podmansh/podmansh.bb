SUMMARY = "Confined login and user shell using podman"
DESCRIPTION = "podmansh provides a confined login and user shell with access to volumes and \
capabilities specified in user quadlets. \
 \
It is a symlink to /usr/bin/podman and execs into the `podmansh` container \
when `/usr/bin/podmansh is set as a login shell or set as os.Args[0]."
LICENSE = "Apache-2.0"

PV = "4.6.2"

RPM_NAME = "podmansh-4.6.2-1.1.aarch64.rpm"
RPM_HASH = "574705d045d26a5335737644dca4a3119608ea10cb77997c8b0022819ec9dc261fbf9e2c419446b670eafd11ddecba87676cdcc333a2b86eb1bb8d308c2f8238"

RPROVIDES:${PN} += "podman-podmansh \
podman-shell \
podmansh"

RDEPENDS:${PN} += "podman"

inherit rpm
