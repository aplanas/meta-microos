SUMMARY = "Python bindings for espeak"
DESCRIPTION = "Python bindings for the eSpeak speech synthesizer."
LICENSE = "GPL-3.0-or-later"

PV = "0.5"

RPM_NAME = "python311-espeak-0.5-5.26.aarch64.rpm"
RPM_HASH = "0fc90516c0fadb13b4493f25a184a9f45a846b6c3062fdd1f2a6272030edad6108dd941f031956d02c77c976970c5d90ea99e3067ee8c0d5bc31b1945721b3b3"

RPROVIDES:${PN} += "python3-espeak \
python3.11dist-python-espeak \
python311-espeak \
python3dist-python-espeak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libespeak.so.1 \
python-abi"

inherit rpm
