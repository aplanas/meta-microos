SUMMARY = "Pytest plugin for testing Matplotlib figures"
DESCRIPTION = "This is a pytest plugin to help with testing figures output from Matplotlib."
LICENSE = "BSD-2-Clause"

PV = "0.12.0"

RPM_NAME = "python311-pytest-mpl-0.12.0-1.9.noarch.rpm"
RPM_HASH = "5f16c58d8522a315f7f552f158cb24520c3ecccaf35050ad01896765076f1f1e073f3237516d57a27ab6e76d1323e24b8f8c2b40229448b29d122b8a2fcfba25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-mpl) \
python311-pytest-mpl \
python3dist(pytest-mpl)"
RDEPENDS:${PN} += "python(abi) \
python311-Pillow \
python311-matplotlib \
python311-pytest"

inherit rpm
