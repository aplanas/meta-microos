SUMMARY = "A library implementing the 'SemVer' scheme"
DESCRIPTION = "This small python library provides a few tools to handle `SemVer`_ in Python. \
It follows strictly the 2.0.0 version of the SemVer scheme."
LICENSE = "BSD-2-Clause"

PV = "2.10.0"

RPM_NAME = "python311-semantic_version-2.10.0-3.1.noarch.rpm"
RPM_HASH = "0a1952203dd3efd65b347137147829ac607156bc83470ced9d391ce8fb2d10b5f26725330584dc30424de1407dc83d48d39eb1e39829e56d61ef2f0a04c071c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-semantic-version \
python311-semantic-version \
python3dist-semantic-version"

RDEPENDS:${PN} += "python-abi"

inherit rpm
