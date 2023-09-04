SUMMARY = "Test suite for libfabric API"
DESCRIPTION = "Fabtests provides a set of examples that uses libfabric, a fabric software library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "1.18.1"

RPM_NAME = "fabtests-1.18.1-2.1.aarch64.rpm"
RPM_HASH = "bc71df33142e380024ce9e22ab9244ebbdc23c30f6335f5eaa63d4715c25a0a6898536fceb1b0499c4923102b7f563ae44cb6325075fb5814a12b9b1488eff9f"

RPROVIDES:${PN} += "fabtests"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfabric.so.1"

inherit rpm
