SUMMARY = "GDB pretty printers for the C++ standard library"
DESCRIPTION = "This package contains pretty printers for the C++ standard library usable \
from GDB."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "libstdc++6-pp-gcc12-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "e5b099b358ac8731491e48a91a1428c3f1a36077d4e7387d6dfa73ffc1ead6b756a774038e7ff3e583bddd732b219693fbe52081f907d64f80fb53dd449f4aea"

RPROVIDES:${PN} += "libstdc++6-pp \
libstdc++6-pp-gcc10 \
libstdc++6-pp-gcc11 \
libstdc++6-pp-gcc12 \
libstdc++6-pp-gcc9"

RDEPENDS:${PN} += "libstdc++6"

inherit rpm
