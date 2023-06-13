SUMMARY = "A library implementing the 'SemVer' scheme"
DESCRIPTION = "This small python library provides a few tools to handle `SemVer`_ in Python. \
It follows strictly the 2.0.0 version of the SemVer scheme."
LICENSE = "BSD-2-Clause"

PV = "2.10.0"

RPM_NAME = "python310-semantic_version-2.10.0-3.1.noarch.rpm"
RPM_HASH = "e44ac4d01a573110a25925528a5880d15cf9d8aacb9b772036e6b8155bc615199d7f3f920e3ff8bdf695ac571ea99e0a98bf36f980a0f64b36c8648a9a562560"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-semantic_version \
python3.10dist(semantic-version) \
python310-semantic_version \
python3dist(semantic-version)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
