SUMMARY = "File identification library for Python"
DESCRIPTION = "File identification library for Python, including license file SPDX identifier."
LICENSE = "MIT"

PV = "2.2.13"

RPM_NAME = "python310-identify-2.2.13-1.11.noarch.rpm"
RPM_HASH = "a30b659f62c0ff510ef25ccd3e9c82d6cf1d1d5555ae8e0f23050c504f1ed2807f15ec0a8c46aeebb497d85bdeab5a606e46b60f355e1e4b5116e18069717e24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-identify \
python310-identify \
python3dist-identify"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
