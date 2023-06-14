SUMMARY = "A library implementing the 'SemVer' scheme"
DESCRIPTION = "This small python library provides a few tools to handle `SemVer`_ in Python. \
It follows strictly the 2.0.0 version of the SemVer scheme."
LICENSE = "BSD-2-Clause"

PV = "2.10.0"

RPM_NAME = "python39-semantic_version-2.10.0-3.1.noarch.rpm"
RPM_HASH = "59354601e13df113c225a39f9eb7d173841665f2e9604529201b98354f0608de92dc18582477e3764180e9c0f3836e0583067d564b970fab6b45852eac441971"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-semantic-version \
python39-semantic-version \
python3dist-semantic-version"

RDEPENDS:${PN} += "python-abi"

inherit rpm
