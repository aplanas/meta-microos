SUMMARY = "Structured Similarity Image Metric (SSIM)"
DESCRIPTION = "Module for computing Structured Similarity Image Metric (SSIM) in Python."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python310-pyssim-0.5-1.2.noarch.rpm"
RPM_HASH = "15779c9796016e51bc0c1f8a7a01917d5d4a1b8838f7b9dcb52b94889787a238783a57896e4144b7e3934968635655c9dff5331cb65c6d01b6610d259ec3679b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyssim \
python3.10dist-pyssim \
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
