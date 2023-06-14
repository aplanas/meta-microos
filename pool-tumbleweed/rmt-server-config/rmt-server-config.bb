SUMMARY = "RMT default configuration"
DESCRIPTION = "Default nginx configuration for RMT."
LICENSE = "GPL-2.0-or-later"

PV = "2.13"

RPM_NAME = "rmt-server-config-2.13-1.1.aarch64.rpm"
RPM_HASH = "ae88b137ef3533a1d6745bad0cdf7ac03046783248fd0cfc7e11900363e69ad0c5dedc7b5867565bdbb33bc6bbf0346da2e5279e834ff8d6f82ead234d25ee04"

RPROVIDES:${PN} += "config-rmt-server-config \
rmt-server-config \
rmt-server-configuration"

RDEPENDS:${PN} += "/bin/sh \
rmt-server"

inherit rpm
