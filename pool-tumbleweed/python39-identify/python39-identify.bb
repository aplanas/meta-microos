SUMMARY = "File identification library for Python"
DESCRIPTION = "File identification library for Python, including license file SPDX identifier."
LICENSE = "MIT"

PV = "2.2.13"

RPM_NAME = "python39-identify-2.2.13-1.11.noarch.rpm"
RPM_HASH = "c15acf6d000b81bdbe1de4a2db691971350b25a81d1a6d52458cdb40d37a2d5b147f0ec859c9853fb5d77d2c3ad18d7c9c667d698603db16f39d3a089f0f14c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-identify \
python39-identify \
python3dist-identify"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
