SUMMARY = "Malay (bahasa Melayu, بهاس ملايو‎) Dictionary for Aspell"
DESCRIPTION = "A Malay (bahasa Melayu, بهاس ملايو‎) dictionary for the aspell spell checker."
LICENSE = "GFDL-1.2-only"

PV = "0.50"

RPM_NAME = "aspell-ms-0.50-2.14.aarch64.rpm"
RPM_HASH = "467938a73c3662e3b1d272742711e13df6c4c229d7791d904ecf80a052b9c39a0a326990b74c7459cc4e1facea9aea6c9f53bc08fe48f4f4d6234ee133bdcb00"

RPROVIDES:${PN} += "aspell-ms \
aspell-ms(aarch-64) \
locale(aspell:ms)"

RDEPENDS:${PN} += ""

inherit rpm
