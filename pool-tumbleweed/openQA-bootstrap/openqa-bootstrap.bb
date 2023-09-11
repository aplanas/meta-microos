SUMMARY = "Automated openQA setup"
DESCRIPTION = "This can automatically setup openQA - either directly on your system \
or within a systemd-nspawn container."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1693565748.f367431"

RPM_NAME = "openQA-bootstrap-4.6.1693565748.f367431-1.1.aarch64.rpm"
RPM_HASH = "33d8ab5acf5ca6fc305aaa2a67b138eeed5e68ec503e31a649d6886c99c73ff3032ec8a96c05130aca92dece0ac2f568ef297020b608b92200bb081279732659"

RPROVIDES:${PN} += "openQA-bootstrap"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
