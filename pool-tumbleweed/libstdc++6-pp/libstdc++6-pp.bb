SUMMARY = "GDB pretty printers for the C++ standard library"
DESCRIPTION = "This package contains pretty printers for the C++ standard library usable \
from GDB."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "libstdc++6-pp-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "c304d4b8a7d98f651fa4adbfcb03e902da8bd84c2d2a5ab09fbd1daca50f22b518eb3358013bb6746d18d64f57fa73b2fef063109f7fff7e5cbbeea0f6cb45f7"

RPROVIDES:${PN} += "libstdc++6-pp \
libstdc++6-pp(aarch-64) \
libstdc++6-pp-gcc10 \
libstdc++6-pp-gcc11 \
libstdc++6-pp-gcc9"

RDEPENDS:${PN} += "libstdc++6"

inherit rpm
