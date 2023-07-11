SUMMARY = "A rule-based tunnel in Go"
DESCRIPTION = "Clash is a rule-based tunnel in Go."
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "clash-1.12.0-1.5.aarch64.rpm"
RPM_HASH = "e507fd908039660a82e2881bb177679f7d985e08b46d15f272708530b4f5e9d6a7a99daf384bf83716003496df893a635dbc39ad84a39128b787b7110bf77d39"

RPROVIDES:${PN} += "clash \
config-clash"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
