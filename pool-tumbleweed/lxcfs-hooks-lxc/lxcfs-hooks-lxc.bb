SUMMARY = "LXC hooks for lxcfs"
DESCRIPTION = "Configuration to add hooks for lxcfs so that it automatically interoperates \
with LXC for all containers."
LICENSE = "Apache-2.0"

PV = "5.0.2"

RPM_NAME = "lxcfs-hooks-lxc-5.0.2-2.3.noarch.rpm"
RPM_HASH = "19a031242ed0f9b1a3d96836569285dfd2f43b018ecedc8284986936177fd8d01e175f70ef4fc95fa40934d5d9492c5320806a6e3cf98d12d3b766185fb8730a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxcfs-hooks-lxc"

RDEPENDS:${PN} += "lxcfs"

inherit rpm
