SUMMARY = "Python library to apply true color for terminal text"
DESCRIPTION = "A Python library to apply true color for terminal text."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-tcolorpy-0.1.2-1.3.noarch.rpm"
RPM_HASH = "bcf39d0d0187ae3689bae7265b6e96abc9c04b4b259f0b7d8039982a836f5a8f171884df8d9be01a7985718fe9b2b98c98cd0a09d155a266344e3686daf41c2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tcolorpy) \
python39-tcolorpy \
python3dist(tcolorpy)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
