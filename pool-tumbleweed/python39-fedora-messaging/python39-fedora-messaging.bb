SUMMARY = "Python tools for Fedora's messaging infrastructure"
DESCRIPTION = "A set of Python tools for using Fedora's messaging infrastructure."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0"

RPM_NAME = "python39-fedora-messaging-3.2.0-2.4.noarch.rpm"
RPM_HASH = "cf4091d986462b0ab18c38febb52df85f2d67c50a0443af1fea1f7ecff80843b597dd2a3d4e89c5826357911cf7505399b7b241472b9006f5b20bdd8734a102c"
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
