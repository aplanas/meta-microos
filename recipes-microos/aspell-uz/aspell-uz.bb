SUMMARY = "Uzbek (Ўзбекча) Dictionary for Aspell"
DESCRIPTION = "An Uzbek (Ўзбекча) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "aspell-uz-0.6.0-2.14.aarch64.rpm"
RPM_HASH = "52d2ec003d9f9b5d371b08aca7968520b6e02475350b3b9d51fe138db646c0b104450fb67df1674b9ab126555f538d38a6baf056d1619427bae7ae505ec89a2f"

RPROVIDES:${PN} += "aspell-uz \
aspell-uz(aarch-64) \
locale(aspell:uz)"
RDEPENDS:${PN} += ""

inherit rpm
