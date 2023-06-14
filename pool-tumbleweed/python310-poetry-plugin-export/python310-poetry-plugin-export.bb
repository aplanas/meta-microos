SUMMARY = "Poetry plugin to export the dependencies to various formats"
DESCRIPTION = "Poetry plugin to export the dependencies to various formats"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python310-poetry-plugin-export-1.4.0-1.1.noarch.rpm"
RPM_HASH = "c215f9595692860fddab782382f1b2610b1866f9da17fa114596b6a89f54a2decb9035d86f12a9d0d081c188d76f912bf5127c8743099be9ac655c6ff429b312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-poetry-plugin-export \
python3.10dist-poetry-plugin-export \
python310-poetry-plugin-export \
python3dist-poetry-plugin-export"

RDEPENDS:${PN} += "python-abi \
python310-poetry \
python310-poetry-core"

inherit rpm
