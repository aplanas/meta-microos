SUMMARY = "Structured Similarity Image Metric (SSIM)"
DESCRIPTION = "Module for computing Structured Similarity Image Metric (SSIM) in Python."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python311-pyssim-0.5-1.4.noarch.rpm"
RPM_HASH = "1e4ae3e562d341c058bd82169f443335fe40b73d3ae4b111d3f3114a99a3b0cbe18c0e366473242af2b57c7d8b2c44fa89f21b090b3f41e4140c1d8c162865ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyssim \
python3.11dist-pyssim \
python311-pyssim \
python3dist-pyssim"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Pillow \
python311-numpy \
python311-scipy \
update-alternatives"

inherit rpm
