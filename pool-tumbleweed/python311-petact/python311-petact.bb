SUMMARY = "A python package extraction tool"
DESCRIPTION = "Petact is a library used for installing and updating compressed tar files. \
When install_package is called, it downloads an md5 file and compares it with \
the md5 of the locally downloaded tar. If they are different, the old \
extracted files are deleted and the new tar is downloaded and extracted to \
the same place."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-petact-0.1.2-3.14.noarch.rpm"
RPM_HASH = "15c21585ac97215269e851c85442a675f775c13d8ea9a87f61d40a54c270e84376eaaf2010eb197893371543fd8b696bfb72b39586de904b5f6823eb6be180bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-petact \
python3.11dist-petact \
python311-petact \
python3dist-petact"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
