SUMMARY = "A thin, practical wrapper around terminal capabilities in Python"
DESCRIPTION = "Curses-like terminal wrapper with a display based on compositing 2d \
arrays of text."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "python310-blessings-1.7-3.1.noarch.rpm"
RPM_HASH = "3cac2c5725a0816b7f74d42abaf4c229d06a0886ea7d51c80cc462e6ac1d66b5c0b578faa40b889385da8b87b813d88f52209df59833d0801e97adc2e2cd9c30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-blessings \
python3.10dist(blessings) \
python310-blessings \
python3dist(blessings)"
RDEPENDS:${PN} += "python(abi) \
python310-curses \
python310-six"

inherit rpm
