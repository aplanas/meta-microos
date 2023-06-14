SUMMARY = "Plugin to display pytest execution output like a specification"
DESCRIPTION = "pytest plugin to display test execution output like a specification."
LICENSE = "GPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "python311-pytest-spec-3.2.0-1.6.noarch.rpm"
RPM_HASH = "5aa53f21c5895fbbc78610309c07426060f37020527758a47e0e39a198cf2f30f1f5533dd3214eecdcb205fa5db725a9f7615308a370a2a67eb55d59fbb8bdf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-spec \
python311-pytest-spec \
python3dist-pytest-spec"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
