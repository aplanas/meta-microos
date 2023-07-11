SUMMARY = "The mirroring service for pagure"
DESCRIPTION = "pagure-mirror is the service mirroring projects that asked for it outside \
of this pagure instance."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-mirror-5.13.3-1.5.noarch.rpm"
RPM_HASH = "2890db585d9039f1d2dd3b1bc0cca129390cf548195002a42e10e860b12176f022a0b5472b85fef9f85a8f9c4f77cb3bdfdf3634cd4182496b51577d573e5ce1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-mirror"

RDEPENDS:${PN} += "/usr/bin/sh \
pagure \
systemd"

inherit rpm
