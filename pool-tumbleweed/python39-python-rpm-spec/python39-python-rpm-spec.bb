SUMMARY = "Python module for parsing RPM spec files"
DESCRIPTION = "python-rpm-spec is a Python module for parsing RPM spec files. RPMs are build \
from a package's sources along with a spec file. The spec file controls how the \
RPM is built. This module allows you to parse spec files and gives you simple \
access to various bits of information that is contained in the spec file."
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "python39-python-rpm-spec-0.10-1.11.noarch.rpm"
RPM_HASH = "3f36c2d09fadb96a117fbb25bffc1af1629e7198cdce3acef35969b7c8c1c7a4208856906268842d00dae96dbb21cdcde5296ddc2ed29a69ec7e39e4777ef49d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-rpm-spec) \
python39-python-rpm-spec \
python3dist(python-rpm-spec)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
