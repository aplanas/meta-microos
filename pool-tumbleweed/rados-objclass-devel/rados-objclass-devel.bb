SUMMARY = "RADOS object class development kit"
DESCRIPTION = "This package contains libraries and headers needed to develop RADOS object \
class plugins."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "rados-objclass-devel-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "be243abe02f84e7ec0a83f78cd484dd2a0b9c768f75c58a9c4ad0454bb1ef75d2589b7692004f61fe09b7d9ab8b6043d112fbaeafb7ab6b383923128be88750c"

RPROVIDES:${PN} += "rados-objclass-devel"

RDEPENDS:${PN} += "libradospp-devel"

inherit rpm
