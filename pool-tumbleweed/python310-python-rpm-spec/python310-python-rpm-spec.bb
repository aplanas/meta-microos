SUMMARY = "Python module for parsing RPM spec files"
DESCRIPTION = "python-rpm-spec is a Python module for parsing RPM spec files. RPMs are build \
from a package's sources along with a spec file. The spec file controls how the \
RPM is built. This module allows you to parse spec files and gives you simple \
access to various bits of information that is contained in the spec file."
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "python310-python-rpm-spec-0.10-1.13.noarch.rpm"
RPM_HASH = "b332a9c5739bbc7e13a3b53b66c6d82cc57cbde592e1e4b4ec517acf092e49a5cf5b5464c2fb8d0394585f8ce9ba548209f92f84d89e99b03575b2bcdaf67362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-rpm-spec \
python310-python-rpm-spec \
python3dist-python-rpm-spec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
