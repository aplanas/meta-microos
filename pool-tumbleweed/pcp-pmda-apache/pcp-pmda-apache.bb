SUMMARY = "Performance Co-Pilot (PCP) metrics for the Apache webserver"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Apache webserver."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-apache-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "e5f6f31e5aba8c8856602d09d2c540a349e1ce2fa4520b2cd21a0091e40b7cee2e588f996df30770aa103fd25140bf6f8492b62461c07a946be440089db2c2c6"

RPROVIDES:${PN} += "pcp-pmda-apache"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp-web.so.1 \
libpcp.so.3"

inherit rpm
