SUMMARY = "GDB pretty printers for the C++ standard library"
DESCRIPTION = "This package contains pretty printers for the C++ standard library usable \
from GDB."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "libstdc++6-pp-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "f3a940ed59c0d4612d40fd39603146aa71f65fc2dff602dfa6c34ed0a10431dff187b55a4bfbd253d94ef85c474006b6e821eafa61b285eb319a64541b21f734"

RPROVIDES:${PN} += "libstdc++6-pp \
libstdc++6-pp-gcc10 \
libstdc++6-pp-gcc11 \
libstdc++6-pp-gcc9"

RDEPENDS:${PN} += "libstdc++6"

inherit rpm
