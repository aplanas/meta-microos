SUMMARY = "A dark stylesheet for Python and Qt applications"
DESCRIPTION = "QDarkStyle is a dark stylesheet for Python and Qt applications."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python39-QDarkStyle-3.0.2-1.11.noarch.rpm"
RPM_HASH = "3c60bdb158a780fba111ba3be6c2f5835593e5de8d3b5221cb1f7b1808cea69d1725f716663e68713bff3f4b476b16a1d5bc084bb4186da463e2c383e1e8c923"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-qdarkstyle \
python39-QDarkStyle \
python3dist-qdarkstyle"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-QtPy \
python39-setuptools"

inherit rpm
