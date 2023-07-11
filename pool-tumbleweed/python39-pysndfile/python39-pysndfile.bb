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

RPM_NAME = "python39-pysndfile-1.4.4-1.7.aarch64.rpm"
RPM_HASH = "a0a0bbff33c057987ef4177db68a4ad1f15aac6bcc620d51f29bbf2be3a56a9a0ad7b3b81e28e8026b792035fc24cc300917374afef587b873fa35dcb2910682"

RPROVIDES:${PN} += "python3.9dist-pysndfile \
python39-pysndfile \
python3dist-pysndfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsndfile.so.1 \
libstdc++.so.6 \
python-abi \
python39-numpy"

inherit rpm
