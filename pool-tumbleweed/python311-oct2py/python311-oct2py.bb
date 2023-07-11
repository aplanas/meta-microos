SUMMARY = "Python to GNU Octave bridge"
DESCRIPTION = "Oct2Py allows you to seamlessly call M-files and Octave functions from Python. \
It manages the Octave session for you, sharing data behind the scenes using \
MAT files."
LICENSE = "MIT"

PV = "5.0.4"

RPM_NAME = "python311-oct2py-5.0.4-2.10.noarch.rpm"
RPM_HASH = "edc29901ac426184dec143e52d78708f65de56e30fc00a5723e68f20417a022961c92a71dad7c03421fb9715ed256b8f2d7b9a4fb72d9229952ac769563cf582"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oct2py \
python3.11dist-oct2py \
python311-oct2py \
python3dist-oct2py"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-octave-kernel \
python311-scipy"

inherit rpm
