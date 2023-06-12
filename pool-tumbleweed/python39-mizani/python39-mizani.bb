SUMMARY = "Scales for Python"
DESCRIPTION = "Mizani is a scales package for graphics."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python39-mizani-0.8.1-1.2.noarch.rpm"
RPM_HASH = "f9966b3978fcc943b9847f070e3edd652a662de69f4d92d8c7dd7fa732e9731eb910d3e27123152b3d4a0da349c22464180c80e8d22d798a12fdef36cdbfd866"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mizani) \
python39-mizani \
python3dist(mizani)"
RDEPENDS:${PN} += "python(abi) \
python39-matplotlib \
python39-numpy \
python39-palettable \
python39-pandas \
python39-scipy"

inherit rpm
