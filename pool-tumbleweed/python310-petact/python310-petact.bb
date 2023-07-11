SUMMARY = "A python package extraction tool"
DESCRIPTION = "Petact is a library used for installing and updating compressed tar files. \
When install_package is called, it downloads an md5 file and compares it with \
the md5 of the locally downloaded tar. If they are different, the old \
extracted files are deleted and the new tar is downloaded and extracted to \
the same place."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-petact-0.1.2-3.14.noarch.rpm"
RPM_HASH = "beffe9ceb7cb469f0073f525b22827d475ab2109b29feafc2406cee554aed7b81d4f6f632e78c7726d66c7b7d43d4d66fdbae162b6ed059fccfd1640f40337c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-petact \
python310-petact \
python3dist-petact"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
