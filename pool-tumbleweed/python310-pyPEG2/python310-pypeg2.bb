SUMMARY = "PEG Parser-Interpreter framework for Python"
DESCRIPTION = "pyPEG is a plain and simple intrinsic parser interpreter framework \
for Python. It is based on Parsing Expression Grammar, PEG. \
With pyPEG you can parse many formal languages in a very easy way."
LICENSE = "GPL-2.0-only"

PV = "2.15.2"

RPM_NAME = "python310-pyPEG2-2.15.2-3.25.noarch.rpm"
RPM_HASH = "e52b4d5af5fd2a386943d2d788ea9e1a99ea695035375bd80d0f2683c13d05adc477178e0c7c5b9a6f23a4966a8ff33c535e47c24117b09c3f516385e7f8b48f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pypeg2 \
python310-pyPEG2 \
python3dist-pypeg2"

RDEPENDS:${PN} += "python-abi \
python310-lxml"

inherit rpm
