SUMMARY = "GDB pretty printers for the C++ standard library"
DESCRIPTION = "This package contains pretty printers for the C++ standard library usable \
from GDB."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "libstdc++6-pp-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "800eb5b2d6447f85ffd4be0dd119367a06b0e6d4efc2474fe77909c2b2cacfdb4f54ff7e8f3a866fba765ac74b2ffce13ad4d079817d94c9ec9cfb47139be2d6"

RPROVIDES:${PN} += "libstdc++6-pp \
libstdc++6-pp-gcc10 \
libstdc++6-pp-gcc11 \
libstdc++6-pp-gcc9"

RDEPENDS:${PN} += "libstdc++6"

inherit rpm
