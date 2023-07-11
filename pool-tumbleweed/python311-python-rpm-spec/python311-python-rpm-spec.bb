SUMMARY = "Python module for parsing RPM spec files"
DESCRIPTION = "python-rpm-spec is a Python module for parsing RPM spec files. RPMs are build \
from a package's sources along with a spec file. The spec file controls how the \
RPM is built. This module allows you to parse spec files and gives you simple \
access to various bits of information that is contained in the spec file."
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "python311-python-rpm-spec-0.10-1.13.noarch.rpm"
RPM_HASH = "0eda4bf532b55e19361dc8796fb41407730b01bccef77b3fb83f1417c0f86f190ae609cdc9d58e49bfa340214a90274bfacb18236e3fba1acd503e230fb26d16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-rpm-spec \
python3.11dist-python-rpm-spec \
python311-python-rpm-spec \
python3dist-python-rpm-spec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
