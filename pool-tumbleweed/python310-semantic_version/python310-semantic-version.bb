SUMMARY = "A library implementing the 'SemVer' scheme"
DESCRIPTION = "This small python library provides a few tools to handle `SemVer`_ in Python. \
It follows strictly the 2.0.0 version of the SemVer scheme."
LICENSE = "BSD-2-Clause"

PV = "2.10.0"

RPM_NAME = "python310-semantic_version-2.10.0-3.2.noarch.rpm"
RPM_HASH = "1cafa405ef7ca8937937653f9dbdfd98c75893c14ceedaca134a9d40ee4f1b3c3a003498e3fac7fef8b1b359a4a147e19bd26bd3ef7ef5df7e3149f2200d5636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-semantic-version \
python310-semantic-version \
python3dist-semantic-version"

RDEPENDS:${PN} += "python-abi"

inherit rpm
