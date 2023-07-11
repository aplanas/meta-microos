SUMMARY = "A modified version of Supybot (an IRC bot and framework)"
DESCRIPTION = "Limnoria is a Python IRC bot with a plugin API. It is equipped with \
an ACL system for specifying user permissions with per-command \
granularity. Numerous plugins are included."
LICENSE = "BSD-3-Clause"

PV = "2023.02.11"

RPM_NAME = "python39-limnoria-2023.02.11-1.3.noarch.rpm"
RPM_HASH = "f3c52ab2f42c13a364917d7426c468ba42358a8f07a0708fdb59371c508fea9c80265ef0fef80d5f0a66b5302f9952ffbc1a29559796ee82bdddf95e86ca7201"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Supybot \
python3.9dist-limnoria \
python39-limnoria \
python3dist-limnoria"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
procps \
python-abi \
python39 \
python39-PySocks \
python39-chardet \
python39-cryptography \
python39-ecdsa \
python39-feedparser \
python39-python-dateutil \
python39-python-gnupg \
python39-pytzdata \
update-alternatives"

inherit rpm
