SUMMARY = "Check whether a package name is available on PyPI"
DESCRIPTION = "Check whether a package name is available on PyPI"
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python310-pname-1.0.2-1.14.noarch.rpm"
RPM_HASH = "2a874ac64afe4d470142a6631134d2486a9253a7373c49e5a342679929481a98e2ea772d15c9b400ccbd88a2a67276eb80b9c8ade0ce7376b60474579945e2bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pname \
python310-pname \
python3dist-pname"

RDEPENDS:${PN} += "python-abi"

inherit rpm
