SUMMARY = "Python to GNU Octave bridge"
DESCRIPTION = "Oct2Py allows you to seamlessly call M-files and Octave functions from Python. \
It manages the Octave session for you, sharing data behind the scenes using \
MAT files."
LICENSE = "MIT"

PV = "5.0.4"

RPM_NAME = "python310-oct2py-5.0.4-2.10.noarch.rpm"
RPM_HASH = "6a68b4c30213aeb84b0dd88ae505c92431e78686f39f5d24b012f7a1561c8beafe88008942c58d889a027a0f2ebf41301dbf220361ff98defa8ce7645951d1df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-oct2py \
python310-oct2py \
python3dist-oct2py"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-octave-kernel \
python310-scipy"

inherit rpm
