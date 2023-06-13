SUMMARY = "A CLI tool for sr.ht"
DESCRIPTION = "hut is a CLI companion utility to interact with sr.ht."
LICENSE = "AGPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "hut-0.3.0-1.2.aarch64.rpm"
RPM_HASH = "88d897517b22ba14e3a99b34fadde60ed8ab52827174b806343e2d7ea42a0facbf5b04a37a88c7166f0215e8f24fb89232a0abc16b732a1418ca9069f78e8ca7"

RPROVIDES:${PN} += "hut \
hut(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
