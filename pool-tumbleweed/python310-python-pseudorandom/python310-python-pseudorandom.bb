SUMMARY = "A Python library for generating pseudorandom condition"
DESCRIPTION = "A package for pseudorandomization of DataMatrix objects. That is, it allows \
you to apply certain constraints to the randomization."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.2"

RPM_NAME = "python310-python-pseudorandom-0.2.2-3.8.noarch.rpm"
RPM_HASH = "7a851dcf33e018e3a7140862a1c31ee500d142f84965f234b1cfbb24ae183ccca979c9a1290c06b28bc8ce52dce1d55f4c8343120c2068cededce6e3dbc75686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-pseudorandom \
python310-python-pseudorandom \
python3dist-python-pseudorandom"

RDEPENDS:${PN} += "python-abi \
python310-python-datamatrix"

inherit rpm
