SUMMARY = "A modified version of Supybot (an IRC bot and framework)"
DESCRIPTION = "Limnoria is a Python IRC bot with a plugin API. It is equipped with \
an ACL system for specifying user permissions with per-command \
granularity. Numerous plugins are included."
LICENSE = "BSD-3-Clause"

PV = "2023.02.11"

RPM_NAME = "python310-limnoria-2023.02.11-1.3.noarch.rpm"
RPM_HASH = "856c3ac6af6981f26eac2e2074fb80fb7a746cb72b5ef4280499c052d50d562b67b092bd8329873fa7fded4165852bb8945b7d2d93bed858c848acb1baa6b910"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Supybot \
python3.10dist-limnoria \
python310-limnoria \
python3dist-limnoria"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
procps \
python-abi \
python310 \
python310-PySocks \
python310-chardet \
python310-cryptography \
python310-ecdsa \
python310-feedparser \
python310-python-dateutil \
python310-python-gnupg \
python310-pytzdata \
update-alternatives"

inherit rpm
