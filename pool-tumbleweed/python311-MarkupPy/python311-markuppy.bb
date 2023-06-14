SUMMARY = "An HTML/XML generator"
DESCRIPTION = "This is MarkupPy - a Python module that for generating HTML/XML \
for Python programs."
LICENSE = "SUSE-Public-Domain"

PV = "1.14"

RPM_NAME = "python311-MarkupPy-1.14-1.14.noarch.rpm"
RPM_HASH = "7a09ff6d2b85e4eaf40bff4775808047c595ab8730d1c3155f932379cacd45868c11df0902665fa7444dd4b4d86550f451785951c1a621ce2e5c9b0a08e855f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-markuppy \
python311-MarkupPy \
python3dist-markuppy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
