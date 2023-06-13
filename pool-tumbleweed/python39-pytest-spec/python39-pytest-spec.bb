SUMMARY = "Plugin to display pytest execution output like a specification"
DESCRIPTION = "pytest plugin to display test execution output like a specification."
LICENSE = "GPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "python39-pytest-spec-3.2.0-1.6.noarch.rpm"
RPM_HASH = "d40626efdfbf95d1a63c1a435d07aac72e48cd10a09796b033ef4ef500d5dc51ef9c41d7390f9e4084adaf2e04951cd6d49ed0282247e6b4d872bcb32dc4e9f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-spec) \
python39-pytest-spec \
python3dist(pytest-spec)"

RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
