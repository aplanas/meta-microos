SUMMARY = "Python tools for Fedora's messaging infrastructure"
DESCRIPTION = "A set of Python tools for using Fedora's messaging infrastructure."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0"

RPM_NAME = "python311-fedora-messaging-3.2.0-2.6.noarch.rpm"
RPM_HASH = "4e25a23e29b7b2ab61926a6f6701e93d47ff13c2b63c7a50c7d4de4fc218336ef7b3c8ee5ac7cb6375ae9462ade613c827db14e73806c767f7d25078b14d3d67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fedora-messaging \
python3.11dist-fedora-messaging \
python311-fedora-messaging \
python3dist-fedora-messaging"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Twisted \
python311-blinker \
python311-click \
python311-crochet \
python311-jsonschema \
python311-pika \
python311-pyOpenSSL \
python311-pytz \
python311-service-identity \
python311-toml \
update-alternatives"

inherit rpm
