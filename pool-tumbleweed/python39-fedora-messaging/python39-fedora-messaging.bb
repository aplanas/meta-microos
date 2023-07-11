SUMMARY = "Python tools for Fedora's messaging infrastructure"
DESCRIPTION = "A set of Python tools for using Fedora's messaging infrastructure."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0"

RPM_NAME = "python39-fedora-messaging-3.2.0-2.6.noarch.rpm"
RPM_HASH = "017f81036ad2a9f3dc29d10344d7bd8788e1f03f83b38453160183029478baa06596a2a66fe3a9ca471c118a71eb8bb55db427249656eeeddd2280bc0acaed2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fedora-messaging \
python39-fedora-messaging \
python3dist-fedora-messaging"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Twisted \
python39-blinker \
python39-click \
python39-crochet \
python39-jsonschema \
python39-pika \
python39-pyOpenSSL \
python39-pytz \
python39-service-identity \
python39-toml \
update-alternatives"

inherit rpm
