SUMMARY = "Python module to generate and modify bytecode"
DESCRIPTION = "Python module to generate and modify bytecode"
LICENSE = "MIT"

PV = "0.14.2"

RPM_NAME = "python39-bytecode-0.14.2-1.1.noarch.rpm"
RPM_HASH = "6eaad84aee6c6c97c86f730a9096fb4bc67772a851b71d7c97255d9fc9151317465c488fb16a7d431966175449eaa7797892b891586e4dad306c8869469b07e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(bytecode) \
python39-bytecode \
python3dist(bytecode)"

RDEPENDS:${PN} += "(python39-typing-extensions if python39-base < 3.10) \
python(abi)"

inherit rpm
