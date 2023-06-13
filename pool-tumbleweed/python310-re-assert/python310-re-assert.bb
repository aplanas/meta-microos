SUMMARY = "Show Python regex match assertion failures"
DESCRIPTION = "Show where your regex match assertion failed."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-re-assert-1.1.0-2.1.noarch.rpm"
RPM_HASH = "7de2b43bffca5bc91101396fb97bcdb118cba26f891e5e3d5441559fbc4cbb5f3c7ad255227e9b65bf8bda18775a2e403f4a6542ff5eeb53bd7fa16cb5678858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-re-assert \
python3.10dist(re-assert) \
python310-re-assert \
python3dist(re-assert)"

RDEPENDS:${PN} += "python(abi) \
python310-regex"

inherit rpm
