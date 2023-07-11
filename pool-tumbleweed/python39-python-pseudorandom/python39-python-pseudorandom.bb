SUMMARY = "A Python library for generating pseudorandom condition"
DESCRIPTION = "A package for pseudorandomization of DataMatrix objects. That is, it allows \
you to apply certain constraints to the randomization."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.2"

RPM_NAME = "python39-python-pseudorandom-0.2.2-3.8.noarch.rpm"
RPM_HASH = "08746457d5bb990cdde6c4f0941ae830fc23ddbe4f988dc6c34a0353a2284532121dced68184fbd7c5f12be5ae7d63cef18332f196d06bbe91c32543ffe5963a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-pseudorandom \
python39-python-pseudorandom \
python3dist-python-pseudorandom"

RDEPENDS:${PN} += "python-abi \
python39-python-datamatrix"

inherit rpm
