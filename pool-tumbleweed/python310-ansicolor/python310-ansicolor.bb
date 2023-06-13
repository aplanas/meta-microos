SUMMARY = "Python module for ANSI color output and colored highlighting and diffing"
DESCRIPTION = "Ansicolor is a library that offers ANSI color markup for \
command line programs."
LICENSE = "Apache-2.0"

PV = "0.3.2"

RPM_NAME = "python310-ansicolor-0.3.2-1.6.noarch.rpm"
RPM_HASH = "b874bb9fa2e18523d97dc6e5798819585a877c69f26393547735156fdd28bc05e3f470696ccc8f9768139b0ec787f44b4111f5aaad7a3dfb0ad3b5fc0821facd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansicolor \
python3.10dist(ansicolor) \
python310-ansicolor \
python3dist(ansicolor)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
