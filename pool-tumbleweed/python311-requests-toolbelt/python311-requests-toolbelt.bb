SUMMARY = "A utility belt for advanced users of python3-requests"
DESCRIPTION = "This is just a collection of utilities for `python-requests`_, but don't \
really belong in ``requests`` proper. The minimum tested requests version is \
``2.1.0``. In reality, the toolbelt should work with ``2.0.1`` as well, but \
some idiosyncracies prevent effective or sane testing on that version."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python311-requests-toolbelt-1.0.0-1.3.noarch.rpm"
RPM_HASH = "b98f8b02d58ff71a41bada98479d567213371f766def274aa4cc3fa937d0551aef348ff34ab47e39260bb3e75aaeba2c332c01d4cbd36ff6e2a37ce90bf0b828"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-toolbelt \
python3.11dist-requests-toolbelt \
python311-requests-toolbelt \
python3dist-requests-toolbelt"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
