SUMMARY = "Pytest plugin for testing Matplotlib figures"
DESCRIPTION = "This is a pytest plugin to help with testing figures output from Matplotlib."
LICENSE = "BSD-2-Clause"

PV = "0.12.0"

RPM_NAME = "python310-pytest-mpl-0.12.0-1.11.noarch.rpm"
RPM_HASH = "2d768fee376632bac86a03f698ef060e4212a7fad523c4e6c307741fda7afbfc693cc9d80a237d1f35e0468b7ae708b6f3782d13bd875c4c4191ee18210a59e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-mpl \
python310-pytest-mpl \
python3dist-pytest-mpl"

RDEPENDS:${PN} += "python-abi \
python310-Pillow \
python310-matplotlib \
python310-pytest"

inherit rpm
