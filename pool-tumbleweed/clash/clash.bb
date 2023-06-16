SUMMARY = "A rule-based tunnel in Go"
DESCRIPTION = "Clash is a rule-based tunnel in Go."
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "clash-1.12.0-1.4.aarch64.rpm"
RPM_HASH = "6ea0825dde6ac17e0a6edba9e1f8d95bfa2b4b16bea9c129066312146740d3a3c8c7844115b2af7acebc34a89cc8bbac04f26901e4ceb2fb17ad76d5b09df690"

RPROVIDES:${PN} += "clash \
config-clash"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
