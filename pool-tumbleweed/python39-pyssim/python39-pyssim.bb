SUMMARY = "Structured Similarity Image Metric (SSIM)"
DESCRIPTION = "Module for computing Structured Similarity Image Metric (SSIM) in Python."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python39-pyssim-0.5-1.2.noarch.rpm"
RPM_HASH = "c17852f96656db4d3b4e6d41b9ed18a41fe4a97108089534688fa499284800b01463a2fadc248d9896afe0dbc85c7405a6804539d562601a195bf7a4f5105a2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyssim \
python39-pyssim \
python3dist-pyssim"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Pillow \
python39-numpy \
python39-scipy \
update-alternatives"

inherit rpm
