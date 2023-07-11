SUMMARY = "A dark stylesheet for Python and Qt applications"
DESCRIPTION = "QDarkStyle is a dark stylesheet for Python and Qt applications."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python39-QDarkStyle-3.0.2-1.12.noarch.rpm"
RPM_HASH = "ab399b8a3f513fc891b05c14f8a8d86cc2f3d0fedd4b48284771e503360f8e4587741fa14b0f2cbdafcb39a74c0251b8c9d5ef98256b46e025a3d14884307332"
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
