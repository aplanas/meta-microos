SUMMARY = "Library for fast text representation and classification"
DESCRIPTION = "fastText is a library for efficient learning of word \
representations and sentence classification."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python310-fasttext-0.9.2-4.1.aarch64.rpm"
RPM_HASH = "0a762df17344d189e9a698bd6b084218408612c1b7bd4d56fa77d66e19c76c888568aeb7c50b8cce7958eef27cb3ce1098b4a42418ffcba2757890f56ca003d6"

RPROVIDES:${PN} += "python3-fasttext \
python3.10dist-fasttext \
python310-fasttext \
python3dist-fasttext"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python310-numpy \
python310-pybind11 \
python310-setuptools \
update-alternatives"

inherit rpm
