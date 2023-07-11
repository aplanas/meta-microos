SUMMARY = "Pure-python HTTP server"
DESCRIPTION = "Cheroot is the pure-Python HTTP server used by CherryPy."
LICENSE = "BSD-3-Clause"

PV = "9.0.0"

RPM_NAME = "python311-cheroot-9.0.0-4.3.noarch.rpm"
RPM_HASH = "c030d6105f1a86d04227ed3fc0ade5efc61f2dbff0c1b00d6aa78ea6262391c3b1afe05ba23b75ff3aaacff541065c3a08de3f6b9b7fbd160aa27a0aec6f6189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Cheroot \
python3-cheroot \
python3.11dist-cheroot \
python311-Cheroot \
python311-cheroot \
python3dist-cheroot"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-jaraco.functools \
python311-more-itertools"

inherit rpm
