SUMMARY = "Swedish (Svenska) Dictionary for Aspell"
DESCRIPTION = "A Swedish (Svenska) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.51.0"

RPM_NAME = "aspell-sv-0.51.0-2.14.aarch64.rpm"
RPM_HASH = "f5cdff486c126af86a797d71633208971a35621668714f4802b92760265f57083a98ace286b515c55d0f97b4648b31dd8443d1b96506552ef21a7be9fc89d112"

RPROVIDES:${PN} += "aspell-se aspell-sv aspell-sv(aarch-64) locale(aspell:sv)"
RDEPENDS:${PN} += ""

inherit rpm
