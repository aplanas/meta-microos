SUMMARY = "Python to GNU Octave bridge"
DESCRIPTION = "Oct2Py allows you to seamlessly call M-files and Octave functions from Python. \
It manages the Octave session for you, sharing data behind the scenes using \
MAT files."
LICENSE = "MIT"

PV = "5.0.4"

RPM_NAME = "python39-oct2py-5.0.4-2.9.noarch.rpm"
RPM_HASH = "4ae25fd2783687b561eb5c12715c2cd5d80952fa08d682abec18eaf4734f3bff0b1343ceb32ae25de0a3ece1ebb7e6a013d9b39c8ffe6dfb06eb3ad5e2fd269a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(oct2py) \
python39-oct2py \
python3dist(oct2py)"

RDEPENDS:${PN} += "python(abi) \
python39-numpy \
python39-octave-kernel \
python39-scipy"

inherit rpm
