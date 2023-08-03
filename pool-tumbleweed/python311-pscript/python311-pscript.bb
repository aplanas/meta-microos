SUMMARY = "Python to JavaScript compiler"
DESCRIPTION = "PScript is a Python to JavaScript compiler, and is also the name of the subset \
of Python that this compiler supports."
LICENSE = "BSD-2-Clause"

PV = "0.7.7"

RPM_NAME = "python311-pscript-0.7.7-2.1.noarch.rpm"
RPM_HASH = "6769e2abfe842565a7ff3edf5a20f66ffca3f0b3d53d07466c9c132c2439320de5d95f643de0c5aeb64b14998055bad5c979206110450a664046480933aab7ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pscript \
python3.11dist-pscript \
python311-pscript \
python3dist-pscript"

RDEPENDS:${PN} += "python-abi"

inherit rpm
