SUMMARY = "Catalan (català) Dictionary for Aspell"
DESCRIPTION = "A Catalan (català) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.60.1.20090722"

RPM_NAME = "aspell-ca-0.60.1.20090722-2.14.aarch64.rpm"
RPM_HASH = "4df716c5c7cb6ae0371dd0d303b609eb5aacee9537f6881761ff583e55b1ddb140b881bb99467532e5f8e00d453ca00af57c66dc57f42c20e053072c45a7c75a"

RPROVIDES:${PN} += "aspell-ca \
aspell-ca(aarch-64) \
locale(aspell:ca)"

RDEPENDS:${PN} += ""

inherit rpm
