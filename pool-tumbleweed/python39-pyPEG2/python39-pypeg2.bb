SUMMARY = "PEG Parser-Interpreter framework for Python"
DESCRIPTION = "pyPEG is a plain and simple intrinsic parser interpreter framework \
for Python. It is based on Parsing Expression Grammar, PEG. \
With pyPEG you can parse many formal languages in a very easy way."
LICENSE = "GPL-2.0-only"

PV = "2.15.2"

RPM_NAME = "python39-pyPEG2-2.15.2-3.25.noarch.rpm"
RPM_HASH = "c242a3f49ceb0247aabea5fdf46a0193b65ef291186570fe62a4335273a5853cd8125bb317e63a9d35168daf46c75935afb2d9468c5273b869853009814328b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pypeg2 \
python39-pyPEG2 \
python3dist-pypeg2"

RDEPENDS:${PN} += "python-abi \
python39-lxml"

inherit rpm
