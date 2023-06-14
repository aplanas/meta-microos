SUMMARY = "Python to GNU Octave bridge"
DESCRIPTION = "Oct2Py allows you to seamlessly call M-files and Octave functions from Python. \
It manages the Octave session for you, sharing data behind the scenes using \
MAT files."
LICENSE = "MIT"

PV = "5.0.4"

RPM_NAME = "python311-oct2py-5.0.4-2.9.noarch.rpm"
RPM_HASH = "352ab4827a621b216f91a70659c537d593ab54769f68acaa589661e9f8b35b5f26aa0716b86bf7f269d3ae26bd66c3de7b88876dfa2d48f2ce4d109888cd6afb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-oct2py \
python311-oct2py \
python3dist-oct2py"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-octave-kernel \
python311-scipy"

inherit rpm
