SUMMARY = "A modified version of Supybot (an IRC bot and framework)"
DESCRIPTION = "Limnoria is a Python IRC bot with a plugin API. It is equipped with \
an ACL system for specifying user permissions with per-command \
granularity. Numerous plugins are included."
LICENSE = "BSD-3-Clause"

PV = "2023.02.11"

RPM_NAME = "python311-limnoria-2023.02.11-1.3.noarch.rpm"
RPM_HASH = "c6cdf0acdbaaea6a61dea8910ac8600e7ffb401417a4bcc28b11b82d0cfa1cf90a1c77c05612305792ef775fc10b068f80b29e72bfbeb46e5c58c2773777fddf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Supybot \
python3-limnoria \
python3.11dist-limnoria \
python311-limnoria \
python3dist-limnoria"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
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
