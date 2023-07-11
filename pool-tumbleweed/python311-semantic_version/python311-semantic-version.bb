SUMMARY = "A library implementing the 'SemVer' scheme"
DESCRIPTION = "This small python library provides a few tools to handle `SemVer`_ in Python. \
It follows strictly the 2.0.0 version of the SemVer scheme."
LICENSE = "BSD-2-Clause"

PV = "2.10.0"

RPM_NAME = "python311-semantic_version-2.10.0-3.2.noarch.rpm"
RPM_HASH = "3c042917b53935eeb416e72e5fbfe86abb54edcb7afea85fee5db0fb6e5fae576a472f470e2f17461340cd1554f59d0191feb44d82e448e5bf73fd7ecd176759"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-semantic-version \
python3.11dist-semantic-version \
python311-semantic-version \
python3dist-semantic-version"

RDEPENDS:${PN} += "python-abi"

inherit rpm
