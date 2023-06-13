SUMMARY = "Python Module to use the MPEG Audio Decoder Library"
DESCRIPTION = "pymad is a Python module that allows Python programs to use the MPEG Audio \
Decoder library. pymad provides a high-level API, similar to the pyogg module, \
allowing to read PCM data from MPEG audio streams."
LICENSE = "LGPL-2.0+"

PV = "0.10"

RPM_NAME = "python310-pymad-0.10-1.26.aarch64.rpm"
RPM_HASH = "5b403b2513ea2d7503ecd17d9e67c576af3c5d600dacc53bbf077f12e3f32cfea62780016fa9fb9b051abea5e67aacf26ef2f74c56689389c6198d15494dbe52"

RPROVIDES:${PN} += "python3-pymad \
python3.10dist(pymad) \
python310-pymad \
python310-pymad(aarch-64) \
python3dist(pymad)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmad.so.0()(64bit) \
python(abi)"

inherit rpm
