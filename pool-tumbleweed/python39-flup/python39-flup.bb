SUMMARY = "Random assortment of WSGI servers"
DESCRIPTION = "A random collection of WSGI modules for Python"
LICENSE = "BSD-2-Clause"

PV = "1.0.3.dev20161029"

RPM_NAME = "python39-flup-1.0.3.dev20161029-4.1.noarch.rpm"
RPM_HASH = "6629b94ddbdfc809b68f823d24e93e11563d4953cec4f4d6478c4f8891bfe481906ae1e53a7ae8869f3bc0eba135e6c13226cd1f60a557249c9110c66f323198"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flup \
python39-flup \
python3dist-flup"

RDEPENDS:${PN} += "python-abi"

inherit rpm
