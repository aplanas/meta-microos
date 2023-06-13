SUMMARY = "Checks for old string formatting"
DESCRIPTION = "Checks for old string formatting."
LICENSE = "GPL-2.0-only"

PV = "2.0.0"

RPM_NAME = "python310-flake8-pep3101-2.0.0-1.4.noarch.rpm"
RPM_HASH = "4d781bceea6e7c14cc265432d93adeb954f4b7e5f4e6ac6d64919d056a40ba857b425eb4b16cde3b5fcdd6a1d11da54ca098d06d82be602c129a8d177b2746cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-pep3101 \
python3.10dist(flake8-pep3101) \
python310-flake8-pep3101 \
python3dist(flake8-pep3101)"

RDEPENDS:${PN} += "python(abi) \
python310-flake8"

inherit rpm
