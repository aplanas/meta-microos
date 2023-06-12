SUMMARY = "A Python implementation of the 'Human-friendly HSL' (HSLuv) color model"
DESCRIPTION = "A Python implementation of HUSL (revision 3)."
LICENSE = "MIT"

PV = "4.0.3"

RPM_NAME = "python310-husl-4.0.3-3.17.noarch.rpm"
RPM_HASH = "ae6a43e9ec38baf9f93e1969545a4417a206a1d1133e8cb9085743b902704fc1e6a11b5e78bcb7c3fd2a1642c6d52b24944ba6197fb64bdefbb19b8785b7e05e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-husl \
python3.10dist(husl) \
python310-husl \
python3dist(husl)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
