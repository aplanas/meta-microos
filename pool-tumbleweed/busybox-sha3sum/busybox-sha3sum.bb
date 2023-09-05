SUMMARY = "Busybox applets replacing sha3sum"
DESCRIPTION = "This package contains the symlinks to replace sha3sum with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sha3sum-1.36.1-29.1.noarch.rpm"
RPM_HASH = "45e04f069070533adf306b7404fca491236e5b543bcaae9e321facb07af04c0654b9f1886de05a1ec4f29cd2cc540b6ae46b5080c42df65c1bb646f9e16c8f5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sha3sum"

RDEPENDS:${PN} += "busybox"

inherit rpm
