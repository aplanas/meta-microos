SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "skelcd-installer-net-MicroOS-17.91-1.88.aarch64.rpm"
RPM_HASH = "e2092722b6425b4e5c78e2350e68340c41eff83d7aab02effd3cac647919b9abd981562aa34947589e4a006f23a80970e3af10b4d94f3f5ae46d61810b010715"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
