SUMMARY = "Poetry plugin to export the dependencies to various formats"
DESCRIPTION = "Poetry plugin to export the dependencies to various formats"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python310-poetry-plugin-export-1.4.0-1.3.noarch.rpm"
RPM_HASH = "7a387226e1aab5e1a4300ad6f31e0970837fb50950515b5d501f6f772def0e01e927e9ceafd0b036644c8ca43c88cafff4fad7324be5dd8560d934840f0087f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-poetry-plugin-export \
python310-poetry-plugin-export \
python3dist-poetry-plugin-export"

RDEPENDS:${PN} += "python-abi \
python310-poetry \
python310-poetry-core"

inherit rpm
