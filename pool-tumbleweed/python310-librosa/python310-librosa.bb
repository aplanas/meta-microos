SUMMARY = "Python module for audio and music processing"
DESCRIPTION = "LibROSA is a python package for music and audio analysis. It provides \
the building blocks necessary to create music information retrieval \
systems."
LICENSE = "CC-BY-3.0 & ISC"

PV = "0.9.2"

RPM_NAME = "python310-librosa-0.9.2-5.1.noarch.rpm"
RPM_HASH = "5f13fcf7d8e5a75cb0d477a5ea09665d3b46d5841040089daeab4895b0281f852dc0de5c75878817cf98dfb33fb5e55d8cbb84a66ae42c22dba0838c2445f271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-librosa \
python310-librosa \
python3dist-librosa"

RDEPENDS:${PN} += "python-abi \
python310-SoundFile \
python310-audioread \
python310-decorator \
python310-joblib \
python310-numba \
python310-numpy \
python310-packaging \
python310-pooch \
python310-resampy \
python310-scikit-learn \
python310-scipy"

inherit rpm
