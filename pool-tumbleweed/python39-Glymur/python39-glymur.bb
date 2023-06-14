SUMMARY = "Tools for accessing JPEG2000 files"
DESCRIPTION = "Python interface to the OpenJPEG library"
LICENSE = "MIT"

PV = "0.11.3"

RPM_NAME = "python39-Glymur-0.11.3-1.4.noarch.rpm"
RPM_HASH = "750429066461f3f2e3314912838f49496787b5798d651470bcd2dba78c7c243ff80fc694f2a1b2f8b6f9e54607621d1a0157ffa3ba5c03d066aa72042f9a536f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-glymur \
python39-Glymur \
python3dist-glymur"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-lxml \
python39-numpy \
python39-packaging \
update-alternatives"

inherit rpm
