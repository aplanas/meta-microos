SUMMARY = "Interface Python with pkg-config"
DESCRIPTION = "A Python module to interface with the pkg-config \
command line tool"
LICENSE = "MIT"

PV = "1.5.5"

RPM_NAME = "python310-pkgconfig-1.5.5-1.7.noarch.rpm"
RPM_HASH = "a333c2e220364e0c1c02d3c72e0f6e482fa9772be4c8a4d3006e20e762bc0387de936cefe4f34f77c723961f5fca19610883798eac482166d745033f9066fbde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pkgconfig \
python3.10dist(pkgconfig) \
python310-pkgconfig \
python3dist(pkgconfig)"

RDEPENDS:${PN} += "pkgconfig \
python(abi)"

inherit rpm
