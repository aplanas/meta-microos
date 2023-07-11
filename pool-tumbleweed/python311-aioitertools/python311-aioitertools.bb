SUMMARY = "Itertools and builtins for AsyncIO and mixed iterables"
DESCRIPTION = "Implementation of itertools, builtins, and more for AsyncIO and mixed-type iterables."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python311-aioitertools-0.11.0-1.5.noarch.rpm"
RPM_HASH = "333a6096788e60ba57a373bf95eabd0a40e84fbe0519375e00c792a72681fc57e3162bcecd62c42ce1ca2f6be343ba98e6c1a4419dd2897c550f4c76dbb8d845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aioitertools \
python3.11dist-aioitertools \
python311-aioitertools \
python3dist-aioitertools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
