SUMMARY = "Pytest plugin for testing Matplotlib figures"
DESCRIPTION = "This is a pytest plugin to help with testing figures output from Matplotlib."
LICENSE = "BSD-2-Clause"

PV = "0.12.0"

RPM_NAME = "python39-pytest-mpl-0.12.0-1.9.noarch.rpm"
RPM_HASH = "7d1bb9e3a5164503267b31828b60f2253a305e0503992d63821d23a60ae3074af6ac78eee4f8c8046e15f5167bed90911671624d7d5162afb5fb4182b099b005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-mpl) \
python39-pytest-mpl \
python3dist(pytest-mpl)"

RDEPENDS:${PN} += "python(abi) \
python39-Pillow \
python39-matplotlib \
python39-pytest"

inherit rpm
