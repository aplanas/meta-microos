SUMMARY = "A utility belt for advanced users of python3-requests"
DESCRIPTION = "This is just a collection of utilities for `python-requests`_, but don't \
really belong in ``requests`` proper. The minimum tested requests version is \
``2.1.0``. In reality, the toolbelt should work with ``2.0.1`` as well, but \
some idiosyncracies prevent effective or sane testing on that version."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python310-requests-toolbelt-1.0.0-1.3.noarch.rpm"
RPM_HASH = "9a8df0564c418ece4cd4bccbdce8230f409c539583c74729bb4bc91300347121b32d034956cf8bc52bc9d24e2885076ef8d7036b2ac66dca99a7f72ddb7d5b5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requests-toolbelt \
python310-requests-toolbelt \
python3dist-requests-toolbelt"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
