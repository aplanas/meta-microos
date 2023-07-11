SUMMARY = "Python bindings for espeak"
DESCRIPTION = "Python bindings for the eSpeak speech synthesizer."
LICENSE = "GPL-3.0-or-later"

PV = "0.5"

RPM_NAME = "python39-espeak-0.5-5.26.aarch64.rpm"
RPM_HASH = "65291323392c3fd4b163b9bc22c3e5daa21ae3ac2dfe9cbbb1424bdbbb3c8f9ce3426fb7f78dbc663fad63abf9c5fc742d6355279f6f1558ba0a9ac72ea4e184"

RPROVIDES:${PN} += "python3.9dist-python-espeak \
python39-espeak \
python3dist-python-espeak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libespeak.so.1 \
python-abi"

inherit rpm
