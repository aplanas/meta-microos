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

RPM_NAME = "python310-SoundFile-0.12.1-1.2.noarch.rpm"
RPM_HASH = "92c902ee7ac645f685f571e856ba71a228654e22230871f47b1e18f64b6dc6516f93a82d893dc638b6ff1ac1f5cd98015f510fe69e389ed9331b0a48635faeb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PySoundFile \
python3-SoundFile \
python3-soundfile \
python3.10dist-soundfile \
python310-PySoundFile \
python310-SoundFile \
python310-soundfile \
python3dist-soundfile"

RDEPENDS:${PN} += "libsndfile1 \
python-abi \
python310-cffi"

inherit rpm
