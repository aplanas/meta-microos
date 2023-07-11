SUMMARY = "Python bindings for espeak"
DESCRIPTION = "Python bindings for the eSpeak speech synthesizer."
LICENSE = "GPL-3.0-or-later"

PV = "0.5"

RPM_NAME = "python310-espeak-0.5-5.26.aarch64.rpm"
RPM_HASH = "2a823179c45807b596f57d46a913205c3b06f730720e9d167fd285a7050d59408ebe8a141a2646db6910afb0077e07e48b6086472f9a8e7343d5554994e8593b"

RPROVIDES:${PN} += "python3.10dist-python-espeak \
python310-espeak \
python3dist-python-espeak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libespeak.so.1 \
python-abi"

inherit rpm
