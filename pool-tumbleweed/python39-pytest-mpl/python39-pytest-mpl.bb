SUMMARY = "Pytest plugin for testing Matplotlib figures"
DESCRIPTION = "This is a pytest plugin to help with testing figures output from Matplotlib."
LICENSE = "BSD-2-Clause"

PV = "0.12.0"

RPM_NAME = "python39-pytest-mpl-0.12.0-1.11.noarch.rpm"
RPM_HASH = "cfaef107e6a70089750a690eebbe35c9b79f0951ec5e5c4a8138e2f7788dc0f4bec1e04cd0c5c8e8472dc3114807516a68b6043c4ff36b101bc7409c196ad06a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-mpl \
python39-pytest-mpl \
python3dist-pytest-mpl"

RDEPENDS:${PN} += "python-abi \
python39-Pillow \
python39-matplotlib \
python39-pytest"

inherit rpm
