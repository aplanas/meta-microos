SUMMARY = "A dark stylesheet for Python and Qt applications"
DESCRIPTION = "QDarkStyle is a dark stylesheet for Python and Qt applications."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python310-QDarkStyle-3.0.2-2.1.noarch.rpm"
RPM_HASH = "fece61d43f0215352481679a4ed46cef84a1dd877e63eb37a88eca620fd171528b276329ea6d51ade04478ae581f6c6e286ddbf77cf23680d844ce00bb0337ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-qdarkstyle \
python310-QDarkStyle \
python3dist-qdarkstyle"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-QtPy \
python310-setuptools"

inherit rpm
