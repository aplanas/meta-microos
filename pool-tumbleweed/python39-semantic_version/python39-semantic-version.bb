SUMMARY = "A library implementing the 'SemVer' scheme"
DESCRIPTION = "This small python library provides a few tools to handle `SemVer`_ in Python. \
It follows strictly the 2.0.0 version of the SemVer scheme."
LICENSE = "BSD-2-Clause"

PV = "2.10.0"

RPM_NAME = "python39-semantic_version-2.10.0-3.2.noarch.rpm"
RPM_HASH = "1c24813392055fe7d37a518321fc6f7d847c8238b77ea691d348d4d2d7db2b4d06e895cc043d594d91e2b8aa88f8800ebbf0ac69342599d0632b82ee49b800f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-semantic-version \
python39-semantic-version \
python3dist-semantic-version"

RDEPENDS:${PN} += "python-abi"

inherit rpm
