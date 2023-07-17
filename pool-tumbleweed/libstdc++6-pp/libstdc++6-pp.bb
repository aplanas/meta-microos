SUMMARY = "GDB pretty printers for the C++ standard library"
DESCRIPTION = "This package contains pretty printers for the C++ standard library usable \
from GDB."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "libstdc++6-pp-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "b901cc20c823bae33f9a5efae91a8a2265d528a5ad20717359d2aae487ce1e91c1e7b01f6b2b4d31189fc598b4634ef55bb52050f4f4f828bf8ab8a4f47f0759"

RPROVIDES:${PN} += "libstdc++6-pp \
libstdc++6-pp-gcc10 \
libstdc++6-pp-gcc11 \
libstdc++6-pp-gcc9"

RDEPENDS:${PN} += "libstdc++6"

inherit rpm
