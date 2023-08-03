SUMMARY = "GDB pretty printers for the C++ standard library"
DESCRIPTION = "This package contains pretty printers for the C++ standard library usable \
from GDB."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "libstdc++6-pp-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "1e4ec6026f8f4d5758a6e94667af36b30b0394b1df8cca881aff324ae5a25ebcbd341b0c3eb2b709997d44ccfe68d21ec383131a5289e254af6057c20a3c74fb"

RPROVIDES:${PN} += "libstdc++6-pp \
libstdc++6-pp-gcc10 \
libstdc++6-pp-gcc11 \
libstdc++6-pp-gcc9"

RDEPENDS:${PN} += "libstdc++6"

inherit rpm
