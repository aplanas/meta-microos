SUMMARY = "Python to JavaScript compiler"
DESCRIPTION = "PScript is a Python to JavaScript compiler, and is also the name of the subset \
of Python that this compiler supports."
LICENSE = "BSD-2-Clause"

PV = "0.7.7"

RPM_NAME = "python39-pscript-0.7.7-1.5.noarch.rpm"
RPM_HASH = "4ed0130a8dee76f7bb8380c39150d9e66a9e70299b1011027fa645fb02b99f81f331ba66ea9c1da23382ce735f920ee949e41480068ec038ce482543f6b87286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pscript) \
python39-pscript \
python3dist(pscript)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
