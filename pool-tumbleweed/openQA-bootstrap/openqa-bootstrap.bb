SUMMARY = "Automated openQA setup"
DESCRIPTION = "This can automatically setup openQA - either directly on your system \
or within a systemd-nspawn container."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689162874.c51d4b9"

RPM_NAME = "openQA-bootstrap-4.6.1689162874.c51d4b9-1.1.aarch64.rpm"
RPM_HASH = "a267e54cfe0fc007e8494b5b37f10224b822ef53d672ae169236472963d57953a12d5bbf120d8923ce42a9c37b6c4ff008f884398df89a102d09a303fd6e523a"

RPROVIDES:${PN} += "openQA-bootstrap"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
