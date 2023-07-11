SUMMARY = "Python module for parsing RPM spec files"
DESCRIPTION = "python-rpm-spec is a Python module for parsing RPM spec files. RPMs are build \
from a package's sources along with a spec file. The spec file controls how the \
RPM is built. This module allows you to parse spec files and gives you simple \
access to various bits of information that is contained in the spec file."
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "python39-python-rpm-spec-0.10-1.13.noarch.rpm"
RPM_HASH = "9523928e9347172004519ee8c1cf70a8062e52815cef990574d1ce5d0ef38a785693905666d086a34b33a5443c242924a77b107cfaf4459db495aca0a8b601fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-rpm-spec \
python39-python-rpm-spec \
python3dist-python-rpm-spec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
