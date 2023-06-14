SUMMARY = "Show Python regex match assertion failures"
DESCRIPTION = "Show where your regex match assertion failed."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-re-assert-1.1.0-2.1.noarch.rpm"
RPM_HASH = "d49002b235075f5ed732e469c16714fe47a695405a8ac21e456da394a97f831d3034ee2e665a4eab4e913ffbcc016f9b9c97d90636f3da7fd518864fef47d727"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-re-assert \
python39-re-assert \
python3dist-re-assert"

RDEPENDS:${PN} += "python-abi \
python39-regex"

inherit rpm
