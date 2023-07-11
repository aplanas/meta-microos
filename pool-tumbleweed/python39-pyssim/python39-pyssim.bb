SUMMARY = "Structured Similarity Image Metric (SSIM)"
DESCRIPTION = "Module for computing Structured Similarity Image Metric (SSIM) in Python."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python39-pyssim-0.5-1.4.noarch.rpm"
RPM_HASH = "fca7ee1a9b88964d4f36227c59b7248cb877640dc9b53a6ee3bb7ceba33917a119c8faef459045d3f1f9c5524335db40fbd103a997fed8a7e3ba5bdb0bf14993"
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
