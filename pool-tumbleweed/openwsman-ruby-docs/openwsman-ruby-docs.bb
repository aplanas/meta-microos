SUMMARY = "HTML documentation for OpenWSMAN Ruby bindings"
DESCRIPTION = "This package provides HTML documentation for the OpenWSMAN Ruby \
bindings."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "openwsman-ruby-docs-2.7.2-2.8.noarch.rpm"
RPM_HASH = "cfccc99caa76cc0fb41a5e94c8b17c1723898018c9e79759c0225735c42d5e15c90fafdff62f88f62a0060f695a04e18c76d99de1537755e2ac37815cdfee715"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openwsman-ruby-docs"

RDEPENDS:${PN} += ""

inherit rpm
