SUMMARY = "Ancient Greek (Ἑλληνική) Dictionary for Aspell"
DESCRIPTION = "An Ancient Greek (Ἑλληνική) dictionary for the aspell spell checker."
LICENSE = "GPL-3.0-only"

PV = "0.02.0"

RPM_NAME = "aspell-grc-0.02.0-2.14.aarch64.rpm"
RPM_HASH = "a59bafdcf8c2bfda1c8d26a76a5359cd05f1879c3ee83a88e9d901283d1ba4b606645184352c113da25e8eff50520b815db9f50721e41f1ac1d165fe43ea6c26"

RPROVIDES:${PN} += "aspell-grc aspell-grc(aarch-64) locale(aspell:grc)"
RDEPENDS:${PN} += ""

inherit rpm
