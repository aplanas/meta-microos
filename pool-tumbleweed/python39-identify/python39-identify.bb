SUMMARY = "File identification library for Python"
DESCRIPTION = "File identification library for Python, including license file SPDX identifier."
LICENSE = "MIT"

PV = "2.2.13"

RPM_NAME = "python39-identify-2.2.13-1.9.noarch.rpm"
RPM_HASH = "37d093574fb11382e8322e1bbb8121ebb486d3260b07ffc98e7ad1d2d7c07609caa4f77c03ed37f6bf657922d91e6c68fbc7df9dad11375b0ad31289460d5a82"
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
