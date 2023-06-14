SUMMARY = "PEG Parser-Interpreter framework for Python"
DESCRIPTION = "pyPEG is a plain and simple intrinsic parser interpreter framework \
for Python. It is based on Parsing Expression Grammar, PEG. \
With pyPEG you can parse many formal languages in a very easy way."
LICENSE = "GPL-2.0-only"

PV = "2.15.2"

RPM_NAME = "python39-pyPEG2-2.15.2-3.23.noarch.rpm"
RPM_HASH = "cbad6711d6d88404f5665d045fc9f060e8f879f21d57b491ac741f95cc60eaff95402d1758b40bcaf92aabadd8980f3c9fd85c9c924e08345c0d432edf5bea8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pypeg2 \
python39-pyPEG2 \
python3dist-pypeg2"

RDEPENDS:${PN} += "python-abi \
python39-lxml"

inherit rpm
