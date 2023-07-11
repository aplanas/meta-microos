SUMMARY = "Python tools for Fedora's messaging infrastructure"
DESCRIPTION = "A set of Python tools for using Fedora's messaging infrastructure."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0"

RPM_NAME = "python310-fedora-messaging-3.2.0-2.6.noarch.rpm"
RPM_HASH = "d0a529374923c01c2c1a4e51ceeffd936673a2d1e3c83eb25a297b2499e603f0eaa52de817b508d6a60142529532e41c0e634cd372e7ba250f9a9b86d7dbdca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fedora-messaging \
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
