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

RPM_NAME = "python311-SoundFile-0.12.1-1.4.noarch.rpm"
RPM_HASH = "7694d3942440cf86355e75edfe3cb4291108c82c844f9a89a71d13f5d25bdb21f096adab6543c481db78234bdf8487091ae9a14466b74151209fa0c08cbf3463"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PySoundFile \
python3-SoundFile \
python3-soundfile \
python3.11dist-soundfile \
python311-PySoundFile \
python311-SoundFile \
python311-soundfile \
python3dist-soundfile"

RDEPENDS:${PN} += "libsndfile1 \
python-abi \
python311-cffi"

inherit rpm
