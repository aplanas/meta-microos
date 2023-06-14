SUMMARY = "An HTML/XML generator"
DESCRIPTION = "This is MarkupPy - a Python module that for generating HTML/XML \
for Python programs."
LICENSE = "SUSE-Public-Domain"

PV = "1.14"

RPM_NAME = "python39-MarkupPy-1.14-1.14.noarch.rpm"
RPM_HASH = "6833e7e36c78ed5659d2b5a8273c98048ebf19e4635b0a47101fd71c8bb4e318203bb0e5a11c2e277789aaf2cd3283053ba6598f26e0918862e61b5f9d2bf0a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-markuppy \
python39-MarkupPy \
python3dist-markuppy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
