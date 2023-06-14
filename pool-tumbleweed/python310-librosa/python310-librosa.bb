SUMMARY = "Python module for audio and music processing"
DESCRIPTION = "LibROSA is a python package for music and audio analysis. It provides \
the building blocks necessary to create music information retrieval \
systems."
LICENSE = "CC-BY-3.0 & ISC"

PV = "0.9.2"

RPM_NAME = "python310-librosa-0.9.2-4.2.noarch.rpm"
RPM_HASH = "e44e4105393e1a55f8e5b2df89112fa14240fe3b6447f240c8c2d0e9395c96b6e59194063c43e41e48a39bc61d651a13bc1a849f64450c22bb2c3b9a485b3619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-librosa \
python3.10dist-librosa \
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
