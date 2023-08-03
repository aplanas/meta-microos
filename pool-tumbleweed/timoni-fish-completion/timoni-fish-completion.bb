SUMMARY = "Fish Completion for timoni"
DESCRIPTION = "Fish command line completion support for timoni."
LICENSE = "Apache-2.0"

PV = "0.11.1"

RPM_NAME = "timoni-fish-completion-0.11.1-1.1.noarch.rpm"
RPM_HASH = "8f0c571b56d810b3830a0b3a4b2d7f4db6ffe1154c1476fc5e9163c37816169b535f5ce89cc70dc61f4aa79e93e804ea37a8bce1cd3f57fd266e62824b0b9804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "timoni-fish-completion"

RDEPENDS:${PN} += "timoni"

inherit rpm
