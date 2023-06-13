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

RPM_NAME = "python311-SoundFile-0.12.1-1.2.noarch.rpm"
RPM_HASH = "400c01ef419b8b6d7a03bf6fb4d0e8674058682218d2aa34561f6584d1e199f0e9e4df8a0d949ae154ab0d348d7ef1212484d278cb8f850b4314c89bee5c75c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(soundfile) \
python311-PySoundFile \
python311-SoundFile \
python311-soundfile \
python3dist(soundfile)"

RDEPENDS:${PN} += "libsndfile1 \
python(abi) \
python311-cffi"

inherit rpm
