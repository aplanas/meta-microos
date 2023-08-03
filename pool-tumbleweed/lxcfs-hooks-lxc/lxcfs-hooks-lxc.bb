SUMMARY = "LXC hooks for lxcfs"
DESCRIPTION = "Configuration to add hooks for lxcfs so that it automatically interoperates \
with LXC for all containers."
LICENSE = "Apache-2.0"

PV = "5.0.4"

RPM_NAME = "lxcfs-hooks-lxc-5.0.4-1.1.noarch.rpm"
RPM_HASH = "bca108be34f8b6faedb2c270b96e439e22c0bac3fa3584071f450b4d1adc7da8cdee517d4abf2dd868af123af3c4f0411a77f1b40be1874f8662c4f62ae93865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxcfs-hooks-lxc"

RDEPENDS:${PN} += "lxcfs"

inherit rpm
