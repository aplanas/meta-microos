SUMMARY = "Python module for audio and music processing"
DESCRIPTION = "LibROSA is a python package for music and audio analysis. It provides \
the building blocks necessary to create music information retrieval \
systems."
LICENSE = "CC-BY-3.0 & ISC"

PV = "0.9.2"

RPM_NAME = "python39-librosa-0.9.2-4.2.noarch.rpm"
RPM_HASH = "94667a0f3532468f88653099857c7e71c908fcc407be777ab2a9b47bfcb1ec506459cdfcb6848260795f6e6bcc88a7efc9d2f6017ecbc86435c51f705da20468"
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
