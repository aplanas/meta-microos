SUMMARY = "Busybox applets replacing sha3sum"
DESCRIPTION = "This package contains the symlinks to replace sha3sum with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-sha3sum-1.36.0-26.3.noarch.rpm"
RPM_HASH = "4b0ce26f0522e73d7bb46048ff42f83195fd4ceeb7b179cfbfeb7ebc86dc341bcfd487999a15367a39134539c86f21d44f447c58125d5e9f11737bab686529f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sha3sum"

RDEPENDS:${PN} += "busybox"

inherit rpm
