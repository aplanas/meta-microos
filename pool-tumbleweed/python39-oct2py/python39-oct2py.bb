SUMMARY = "Python to GNU Octave bridge"
DESCRIPTION = "Oct2Py allows you to seamlessly call M-files and Octave functions from Python. \
It manages the Octave session for you, sharing data behind the scenes using \
MAT files."
LICENSE = "MIT"

PV = "5.0.4"

RPM_NAME = "python39-oct2py-5.0.4-2.10.noarch.rpm"
RPM_HASH = "5a4ad710b1e9b1bf3f7177ee2238b5068e1833cd3e82461b797afed71fa294e96ede008670c66d227e523824b5da2aed9a5e026fbd609acd4b252737016ef1ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-oct2py \
python39-oct2py \
python3dist-oct2py"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-octave-kernel \
python39-scipy"

inherit rpm
