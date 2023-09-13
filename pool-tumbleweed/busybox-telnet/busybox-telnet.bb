SUMMARY = "Busybox applets replacing telnet"
DESCRIPTION = "This package contains the symlinks to provide telnet with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-telnet-1.36.1-30.1.noarch.rpm"
RPM_HASH = "31a333ddea3faef15e5b3642fccfedb68047eebaf448997c105041d55019267bf0dd910698f42d8065f06d8c2896ed36eef109294aea183d4544c63717e24a71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-telnet"

RDEPENDS:${PN} += "busybox"

inherit rpm
