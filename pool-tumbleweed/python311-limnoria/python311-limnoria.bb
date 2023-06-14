SUMMARY = "A modified version of Supybot (an IRC bot and framework)"
DESCRIPTION = "Limnoria is a Python IRC bot with a plugin API. It is equipped with \
an ACL system for specifying user permissions with per-command \
granularity. Numerous plugins are included."
LICENSE = "BSD-3-Clause"

PV = "2023.02.11"

RPM_NAME = "python311-limnoria-2023.02.11-1.1.noarch.rpm"
RPM_HASH = "b306532a12157793f31f1cec918a43a5a981feb7dc917e9472cf36b056cc8ec9f3e1ca862da8705928851f3b2f1603ed54b5c16cfc0bf762086c42bfda803b11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Supybot \
python3.11dist-limnoria \
python311-limnoria \
python3dist-limnoria"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
procps \
python-abi \
python311 \
python311-PySocks \
python311-chardet \
python311-cryptography \
python311-ecdsa \
python311-feedparser \
python311-python-dateutil \
python311-python-gnupg \
python311-pytzdata \
update-alternatives"

inherit rpm
