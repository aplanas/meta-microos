SUMMARY = "Python library for reading and writing image, video, and related formats"
DESCRIPTION = "Imageio is a Python library that provides an interface to read and \
write a wide range of image data, including animated images, volumetric \
data, and scientific formats."
LICENSE = "BSD-2-Clause"

PV = "2.21.2"

RPM_NAME = "python310-imageio-2.21.2-1.4.noarch.rpm"
RPM_HASH = "6ed9cc9e2e1196f96b464748496e8ec9edfb8c39fe948448ac45c844ec561d9736e33238228949d855f938d8774266ed53807fa157424642362967ef921ac4b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-imageio \
python3.10dist-imageio \
python310-imageio \
python3dist-imageio"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Pillow \
python310-numpy \
update-alternatives"

inherit rpm
