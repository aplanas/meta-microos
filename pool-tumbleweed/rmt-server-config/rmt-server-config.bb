SUMMARY = "RMT default configuration"
DESCRIPTION = "Default nginx configuration for RMT."
LICENSE = "GPL-2.0-or-later"

PV = "2.13"

RPM_NAME = "rmt-server-config-2.13-1.2.aarch64.rpm"
RPM_HASH = "ac6307bac7bafa27df6513fd38035d1334592d6ffd23dbbba70724826be444659dc69c98ff59945ec27b70f97a60f5122de4859979435c53fc0879bf790ed5bb"

RPROVIDES:${PN} += "config-rmt-server-config \
rmt-server-config \
rmt-server-configuration"

RDEPENDS:${PN} += "/usr/bin/sh \
rmt-server"

inherit rpm
