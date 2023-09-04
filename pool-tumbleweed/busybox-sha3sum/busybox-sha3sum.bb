SUMMARY = "Busybox applets replacing sha3sum"
DESCRIPTION = "This package contains the symlinks to replace sha3sum with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sha3sum-1.36.1-28.1.noarch.rpm"
RPM_HASH = "b91b8469233f8be47a44274527315c84ddf5d33d1911133ddfde917fb22d334b2ef3fdafb66de5f348e050b9e6941147dce4376e5f42d58d89ce48fb97085c2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sha3sum"

RDEPENDS:${PN} += "busybox"

inherit rpm
