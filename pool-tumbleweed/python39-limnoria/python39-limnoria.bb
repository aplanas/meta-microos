SUMMARY = "A modified version of Supybot (an IRC bot and framework)"
DESCRIPTION = "Limnoria is a Python IRC bot with a plugin API. It is equipped with \
an ACL system for specifying user permissions with per-command \
granularity. Numerous plugins are included."
LICENSE = "BSD-3-Clause"

PV = "2023.02.11"

RPM_NAME = "python39-limnoria-2023.02.11-1.1.noarch.rpm"
RPM_HASH = "e5a380c8e22d373562027cfc3126ca523810179faf5ed787ade38825705b2bac1dbd790849bb7547f39c1857d2899dfe0850b38fca34d125a6d925cf10438f2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Supybot \
python3.9dist(limnoria) \
python39-limnoria \
python3dist(limnoria)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
procps \
python(abi) \
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
