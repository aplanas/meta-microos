SUMMARY = "Plugin to display pytest execution output like a specification"
DESCRIPTION = "pytest plugin to display test execution output like a specification."
LICENSE = "GPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "python310-pytest-spec-3.2.0-1.8.noarch.rpm"
RPM_HASH = "aa3e0641088ed9fafd17cefcffee6fd78cc955ab0dc8553db38482320ff5c51bee1541f41d9d93327cd210eb11462dc99b23847f550b7226bc18a1864976b13f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-spec \
python310-pytest-spec \
python3dist-pytest-spec"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
