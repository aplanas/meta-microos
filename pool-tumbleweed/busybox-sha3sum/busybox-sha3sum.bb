SUMMARY = "Busybox applets replacing sha3sum"
DESCRIPTION = "This package contains the symlinks to replace sha3sum with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sha3sum-1.36.1-30.1.noarch.rpm"
RPM_HASH = "4204ed9af2b2240d6ad9819eb4fd77753d48d8185eb77684f4a25c02958be7103392092b9d3d4a497e02dfb2edca85aba85ac002217440e0bfcb7801f36bece3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sha3sum"

RDEPENDS:${PN} += "busybox"

inherit rpm
