SUMMARY = "Cython wrapper class for reading/writing soundfiles"
DESCRIPTION = "pysndfile is a python package providing PySndfile a \
Cython wrapper class around libsndfile . PySndfile \
provides methods for reading and writing a large variety of soundfile \
formats on a variety of plattforms. PySndfile provides a rather complete \
access to the different sound file manipulation options that are \
available in libsndfile. \
 \
Due to the use of libsndfile nearly all sound file formats, (besides mp3 \
and derived formats) can be read and written with PySndfile. \
 \
The interface has been designed such that a rather large subset of the \
functionality of libsndfile can be used, notably the reading and writing \
of strings into soundfile formats that support these, and a number of \
sf\\_commands that allow to control the way libsndfile reads and writes \
the samples. One of the most important ones is the use of the clipping \
command."
LICENSE = "LGPL-3.0-only"

PV = "1.4.4"

RPM_NAME = "python311-pysndfile-1.4.4-1.7.aarch64.rpm"
RPM_HASH = "5a8933cbb9f019c2e0330ddde2d66fb9e43132b4e1d4eb76a1952422e9762c52ee130fb298d364f53c05fec89d5b798330bdb223277c06ac6009e3dd18ca5e12"

RPROVIDES:${PN} += "python3-pysndfile \
python3.11dist-pysndfile \
python311-pysndfile \
python3dist-pysndfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsndfile.so.1 \
libstdc++.so.6 \
python-abi \
python311-numpy"

inherit rpm
