SUMMARY = "A python package extraction tool"
DESCRIPTION = "Petact is a library used for installing and updating compressed tar files. \
When install_package is called, it downloads an md5 file and compares it with \
the md5 of the locally downloaded tar. If they are different, the old \
extracted files are deleted and the new tar is downloaded and extracted to \
the same place."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-petact-0.1.2-3.14.noarch.rpm"
RPM_HASH = "84a448f7186e71ca162ed32ac0b0e77f4898f46aaadbd9758cc40b4b140f163b8009654058b6b9e5d11f6f85dffd6f5f24cc78fc921e1259e1fb51b4c5d9c085"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-petact \
python39-petact \
python3dist-petact"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
