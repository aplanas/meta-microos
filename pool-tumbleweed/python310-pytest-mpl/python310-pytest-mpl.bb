SUMMARY = "Pytest plugin for testing Matplotlib figures"
DESCRIPTION = "This is a pytest plugin to help with testing figures output from Matplotlib."
LICENSE = "BSD-2-Clause"

PV = "0.12.0"

RPM_NAME = "python310-pytest-mpl-0.12.0-1.9.noarch.rpm"
RPM_HASH = "401c7d54059d6094f0a3da05abd06d13900c22256e668b9f216912dcb6b980da60a382229b9ca19fb7b5646404ba9224c00d006a5675da398cff7da8536f326b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-mpl \
python3.10dist(pytest-mpl) \
python310-pytest-mpl \
python3dist(pytest-mpl)"

RDEPENDS:${PN} += "python(abi) \
python310-Pillow \
python310-matplotlib \
python310-pytest"

inherit rpm
