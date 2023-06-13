SUMMARY = "Python to JavaScript compiler"
DESCRIPTION = "PScript is a Python to JavaScript compiler, and is also the name of the subset \
of Python that this compiler supports."
LICENSE = "BSD-2-Clause"

PV = "0.7.7"

RPM_NAME = "python311-pscript-0.7.7-1.5.noarch.rpm"
RPM_HASH = "56d0e4e675965e75522c7b7c64c347a83d8927a6490b8a0849619fb45101af1274b0b46dccc9c058a53bd7b91f6a508581f5dfff23ae19c66b9a3f3ce9fd8258"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pscript) \
python311-pscript \
python3dist(pscript)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
