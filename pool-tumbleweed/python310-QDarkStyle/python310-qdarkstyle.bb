SUMMARY = "A dark stylesheet for Python and Qt applications"
DESCRIPTION = "QDarkStyle is a dark stylesheet for Python and Qt applications."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python310-QDarkStyle-3.0.2-1.12.noarch.rpm"
RPM_HASH = "829f8df91867fcc912973eb1a0aa821f9124eff0653a5a76ebee6a7b395e1df4f32d8bcd281516a05bb0ecfcf1be7ca236fe09f8312fe542c1aa2f0c49c703ef"
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
