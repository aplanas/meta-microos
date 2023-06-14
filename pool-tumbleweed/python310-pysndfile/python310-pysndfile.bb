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

RPM_NAME = "python310-pysndfile-1.4.4-1.5.aarch64.rpm"
RPM_HASH = "e5139862fc557aea357b6e47305158b4662b23ee3f3fc0b4aa9d3bcf8400f25532bae5cca781f7bf49dcbe2d06e32583698e93c3decbba6777b071b743d0d557"

RPROVIDES:${PN} += "python3-pysndfile \
python3.10dist-pysndfile \
python310-pysndfile \
python3dist-pysndfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsndfile.so.1 \
libstdc++.so.6 \
python-abi \
python310-numpy"

inherit rpm
