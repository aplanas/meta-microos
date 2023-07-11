SUMMARY = "Assertion library for Python"
DESCRIPTION = "preggy is an assertion library for Python. (What were you ``expect()``ing?) \
Part of the pyVows test framework."
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "python311-preggy-1.4.4-2.14.noarch.rpm"
RPM_HASH = "098b1b2bc2cb3143229668cb1cdd9182cdbd1948ceb7c4fd03f4cc1f42dd249ef9f9ee07793b4a22081b1f02c13853c75f69b6ca7def4db84e3f9a152ababf61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-preggy \
python3.11dist-preggy \
python311-preggy \
python3dist-preggy"

RDEPENDS:${PN} += "python-abi \
python311-Unidecode \
python311-six"

inherit rpm
