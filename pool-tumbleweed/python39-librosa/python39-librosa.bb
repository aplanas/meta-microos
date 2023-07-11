SUMMARY = "Python module for audio and music processing"
DESCRIPTION = "LibROSA is a python package for music and audio analysis. It provides \
the building blocks necessary to create music information retrieval \
systems."
LICENSE = "CC-BY-3.0 & ISC"

PV = "0.9.2"

RPM_NAME = "python39-librosa-0.9.2-5.1.noarch.rpm"
RPM_HASH = "c28c428b6af3e6a42cdd434106de77a581ad733e10e8f2e8b89ce34b9fb89f1a5fffb00f2d0c536d4683ffe98084396af7044f82f57008e2b7e9df9c9b76d824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-librosa \
python39-librosa \
python3dist-librosa"

RDEPENDS:${PN} += "python-abi \
python39-SoundFile \
python39-audioread \
python39-decorator \
python39-joblib \
python39-numba \
python39-numpy \
python39-packaging \
python39-pooch \
python39-resampy \
python39-scikit-learn \
python39-scipy"

inherit rpm
