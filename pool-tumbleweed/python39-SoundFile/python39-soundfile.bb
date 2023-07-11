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

RPM_NAME = "python39-SoundFile-0.12.1-1.4.noarch.rpm"
RPM_HASH = "a32661ba90369144a52943a70eeb8d0b858b3e22e9e3bc5ba8eab9c2dc74731d0b6f2fc42518e64e95aba1b3c1eb0c30979d1a8dc0df3061c3bec1bb2f58efac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-soundfile \
python39-PySoundFile \
python39-SoundFile \
python39-soundfile \
python3dist-soundfile"

RDEPENDS:${PN} += "libsndfile1 \
python-abi \
python39-cffi"

inherit rpm
