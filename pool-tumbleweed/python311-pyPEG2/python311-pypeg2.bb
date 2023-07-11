SUMMARY = "PEG Parser-Interpreter framework for Python"
DESCRIPTION = "pyPEG is a plain and simple intrinsic parser interpreter framework \
for Python. It is based on Parsing Expression Grammar, PEG. \
With pyPEG you can parse many formal languages in a very easy way."
LICENSE = "GPL-2.0-only"

PV = "2.15.2"

RPM_NAME = "python311-pyPEG2-2.15.2-3.25.noarch.rpm"
RPM_HASH = "b50a71433663518f00f28eefbf39d60cba96272e9f5723fcda41747fd661dcfdceb29b6e3b3af73dee8de699aeeb7b4885fcbe88637346f46659f83d24b47665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyPEG2 \
python3.11dist-pypeg2 \
python311-pyPEG2 \
python3dist-pypeg2"

RDEPENDS:${PN} += "python-abi \
python311-lxml"

inherit rpm
