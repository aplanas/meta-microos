SUMMARY = "Python library and command-line utility for Shodan"
DESCRIPTION = "Shodan is a search engine for Internet-connected devices. Google lets you search for websites, Shodan lets you search for devices. This library provides developers easy access to all of the data stored in Shodan in order to automate tasks and integrate into existing tools."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "python39-shodan-1.28.0-1.6.noarch.rpm"
RPM_HASH = "1de94e087b3f1c1d6fdde63f5dd8e127cb66d4c27e1e6adbf4f2e01cdda573561942b4dfe1496245c339480640399d17cb85bc1bce718ef89542940e2097d853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-shodan \
python39-shodan \
python3dist-shodan"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-XlsxWriter \
python39-click \
python39-click-plugins \
python39-colorama \
python39-requests \
python39-setuptools \
update-alternatives"

inherit rpm
