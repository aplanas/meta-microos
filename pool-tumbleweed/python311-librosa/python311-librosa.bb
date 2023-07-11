SUMMARY = "Python module for audio and music processing"
DESCRIPTION = "LibROSA is a python package for music and audio analysis. It provides \
the building blocks necessary to create music information retrieval \
systems."
LICENSE = "CC-BY-3.0 & ISC"

PV = "0.9.2"

RPM_NAME = "python311-librosa-0.9.2-5.1.noarch.rpm"
RPM_HASH = "457b588d1448df78732550d50d8c3865529d8dbf449f5a41ce2f56ef4b8c7ea5cacaaf3f210b00f62252e309ed7b811c6eef93a37b7c98cdacb176e6ce1575de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-librosa \
python3.11dist-librosa \
python311-librosa \
python3dist-librosa"

RDEPENDS:${PN} += "python-abi \
python311-SoundFile \
python311-audioread \
python311-decorator \
python311-joblib \
python311-numba \
python311-numpy \
python311-packaging \
python311-pooch \
python311-resampy \
python311-scikit-learn \
python311-scipy"

inherit rpm
