SUMMARY = "Structured Similarity Image Metric (SSIM)"
DESCRIPTION = "Module for computing Structured Similarity Image Metric (SSIM) in Python."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python310-pyssim-0.5-1.4.noarch.rpm"
RPM_HASH = "29b16a9f6637ce60eb7382770b0b65270111987e43cd1846dc1469e920d8a1d040ab8f1ba56e2d286ce3276fe753e32474e96a31a42d5fd741bd5df5234d1041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyssim \
python310-pyssim \
python3dist-pyssim"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Pillow \
python310-numpy \
python310-scipy \
update-alternatives"

inherit rpm
