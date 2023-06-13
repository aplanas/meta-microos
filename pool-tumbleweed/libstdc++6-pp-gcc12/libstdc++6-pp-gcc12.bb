SUMMARY = "GDB pretty printers for the C++ standard library"
DESCRIPTION = "This package contains pretty printers for the C++ standard library usable \
from GDB."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "libstdc++6-pp-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "8cde41966b636cdbcb1a28dd8cd5c8438cc7b7804be07817a1d6d24a9788406aa5b4418024568d6c397f623eb14de6dfa315fbcc6a50d8f2acfb6255ab6f033c"

RPROVIDES:${PN} += "libstdc++6-pp \
libstdc++6-pp-gcc10 \
libstdc++6-pp-gcc11 \
libstdc++6-pp-gcc12 \
libstdc++6-pp-gcc12(aarch-64) \
libstdc++6-pp-gcc9"

RDEPENDS:${PN} += "libstdc++6"

inherit rpm
