SUMMARY = "Assertion library for Python"
DESCRIPTION = "preggy is an assertion library for Python. (What were you ``expect()``ing?) \
Part of the pyVows test framework."
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "python310-preggy-1.4.4-2.14.noarch.rpm"
RPM_HASH = "beec7fd4955a556f7c9b4647491a2daad2d00a4c5254394b2d200a30fc83c4d6a153acf5dc2bf306b99554e28f181ab5d3fee854fe822fb6429338115e887f28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-preggy \
python310-preggy \
python3dist-preggy"

RDEPENDS:${PN} += "python-abi \
python310-Unidecode \
python310-six"

inherit rpm
