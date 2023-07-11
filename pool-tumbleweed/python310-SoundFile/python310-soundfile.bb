SUMMARY = "An audio library based on libsndfile, CFFI and NumPy"
DESCRIPTION = "PySoundFile is an audio library based on libsndfile, CFFI and NumPy. \
Full documentation is available on http://pysoundfile.readthedocs.org/. \
 \
PySoundFile can read and write sound files. File reading/writing is \
supported through libsndfile, which itself is accessed through CFFI, \
a foreign function interface for Python calling C code. PySoundFile \
represents audio data as NumPy arrays."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python310-SoundFile-0.12.1-1.4.noarch.rpm"
RPM_HASH = "3d8f1ab23b9df15de9e56ead45e4cc1032df7a85b3d2fcf4df25fc8c8ef69cf433960ef86d243f21fd749a7e74fddb4ca5c939ae89d03f08a83bad8de49ff984"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-soundfile \
python310-PySoundFile \
python310-SoundFile \
python310-soundfile \
python3dist-soundfile"

RDEPENDS:${PN} += "libsndfile1 \
python-abi \
python310-cffi"

inherit rpm
