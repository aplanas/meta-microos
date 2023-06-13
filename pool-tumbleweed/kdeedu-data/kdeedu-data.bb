SUMMARY = "Data files for KDE Education Applications"
DESCRIPTION = "This package contains common data files used by various KDE education \
applications."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdeedu-data-23.04.1-1.1.noarch.rpm"
RPM_HASH = "889784032eee2ad688eabde80ca3e9c96ed7e9c2480555a6a1952ad41353336b16b47470fd0da0d592aaec2926179bf24cfe13ef8a6204dfafc67d33eaded384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdeedu-data \
libkdeedu4-data \
libkeduvocdocument-data"

RDEPENDS:${PN} += ""

inherit rpm
