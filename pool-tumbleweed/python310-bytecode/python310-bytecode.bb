SUMMARY = "Python module to generate and modify bytecode"
DESCRIPTION = "Python module to generate and modify bytecode"
LICENSE = "MIT"

PV = "0.14.2"

RPM_NAME = "python310-bytecode-0.14.2-1.1.noarch.rpm"
RPM_HASH = "8b1cf9f2b233914158cce2ffd7d414093dc7fc33d8e0bf64a0c2e75b77c90486c331ec685ada8a0f1907c0e1fc6f29f10ed622a704736d510946ab11d55ad267"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bytecode \
python3.10dist(bytecode) \
python310-bytecode \
python3dist(bytecode)"
RDEPENDS:${PN} += "(python310-typing-extensions if python310-base < 3.10) \
python(abi)"

inherit rpm
