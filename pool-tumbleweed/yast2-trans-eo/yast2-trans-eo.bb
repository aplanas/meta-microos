SUMMARY = "YaST2 - Esperanto Translations"
DESCRIPTION = "YaST2 - Esperanto Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-eo-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "2f5c3e20b94076fab2cb1eadc396d80d4d51bc9edda029efaf8c5a359de41b516c0bce309e276714e883539f2f0582ade233a0e2d1bb9753917d19ca159ad022"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-eo \
yast2-trans-eo"

RDEPENDS:${PN} += ""

inherit rpm
