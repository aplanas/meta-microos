SUMMARY = "Pure Python implementation of the Gwyddion file format"
DESCRIPTION = "Pure Python implementation of the Gwyddion file format."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-gwyfile-0.2.0-2.9.noarch.rpm"
RPM_HASH = "02f1923bba1fb6b03156a3665a66dda878fd68b755c52354fcd85530b63849bee92c90b0d06e21fe4f8aeadf7539c8fa19be2440922a343fc74d53159f7ca96d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(gwyfile) \
python39-gwyfile \
python3dist(gwyfile)"
RDEPENDS:${PN} += "python(abi) \
python39-numpy \
python39-six"

inherit rpm
