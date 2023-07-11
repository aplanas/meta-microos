SUMMARY = "Python unittest Utilities"
DESCRIPTION = "Python unittest Utilities."
LICENSE = "BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "python39-case-1.5.3-8.2.noarch.rpm"
RPM_HASH = "b67460a40129498091436be2bf669822086845b22ad1307d5230783300e6390330f29138c64cc3159eed6d2ccc63f53041e8f609dbcea71d4bfadd99f1e1f233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-case \
python39-case \
python3dist-case"

RDEPENDS:${PN} += "python-abi \
python39-pytest \
python39-setuptools \
python39-six"

inherit rpm
