SUMMARY = "Itertools and builtins for AsyncIO and mixed iterables"
DESCRIPTION = "Implementation of itertools, builtins, and more for AsyncIO and mixed-type iterables."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python310-aioitertools-0.11.0-1.5.noarch.rpm"
RPM_HASH = "f160987da18c7ff7c0eb337acd0bb320daecd3123faa9bf3521746137064ee8c2fc61a9bca5ededa5b3e6942a93fd7595751a63b340277574336dc2be2797743"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aioitertools \
python310-aioitertools \
python3dist-aioitertools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
