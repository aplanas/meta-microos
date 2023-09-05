SUMMARY = "GDB pretty printers for the C++ standard library"
DESCRIPTION = "This package contains pretty printers for the C++ standard library usable \
from GDB."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "libstdc++6-pp-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "a95c471c490abac3cd97846c893e0b542119688967d843235b993f792052a45dceeb42997821400072181d7c1ca6650df14eea391bc1810d111e524fd8bc7508"

RPROVIDES:${PN} += "libstdc++6-pp \
libstdc++6-pp-gcc10 \
libstdc++6-pp-gcc11 \
libstdc++6-pp-gcc9"

RDEPENDS:${PN} += "libstdc++6"

inherit rpm
