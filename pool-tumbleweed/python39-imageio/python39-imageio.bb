SUMMARY = "Python library for reading and writing image, video, and related formats"
DESCRIPTION = "Imageio is a Python library that provides an interface to read and \
write a wide range of image data, including animated images, volumetric \
data, and scientific formats."
LICENSE = "BSD-2-Clause"

PV = "2.21.2"

RPM_NAME = "python39-imageio-2.21.2-1.4.noarch.rpm"
RPM_HASH = "710251c38d36a639fcd541a3c6b7f7e78697852fccda09033deda24ee0738e6cffed40e40c08ed752753f24fb5fa6f96e481eda31a1365c682dc4d6eff16c48a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-imageio \
python39-imageio \
python3dist-imageio"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Pillow \
python39-numpy \
update-alternatives"

inherit rpm
