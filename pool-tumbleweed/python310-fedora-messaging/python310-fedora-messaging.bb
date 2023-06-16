SUMMARY = "Python tools for Fedora's messaging infrastructure"
DESCRIPTION = "A set of Python tools for using Fedora's messaging infrastructure."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0"

RPM_NAME = "python310-fedora-messaging-3.2.0-2.4.noarch.rpm"
RPM_HASH = "408ef866c2115c4b4d9f40b81951be39d7517235a638395198bc62bdc276af28d86be570964dc0afba6da27616e1b384b836997d1a140d4b35b367dd9bc80da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fedora-messaging \
python3.10dist-fedora-messaging \
python310-fedora-messaging \
python3dist-fedora-messaging"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Twisted \
python310-blinker \
python310-click \
python310-crochet \
python310-jsonschema \
python310-pika \
python310-pyOpenSSL \
python310-pytz \
python310-service-identity \
python310-toml \
update-alternatives"

inherit rpm
