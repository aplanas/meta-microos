SUMMARY = "Python library and command-line utility for Shodan"
DESCRIPTION = "Shodan is a search engine for Internet-connected devices. Google lets you search for websites, Shodan lets you search for devices. This library provides developers easy access to all of the data stored in Shodan in order to automate tasks and integrate into existing tools."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "python310-shodan-1.28.0-1.6.noarch.rpm"
RPM_HASH = "8375bf6ec6521dd5ea1524651dd36f4980ea7542e7aa819d2b80cba79726e38ba4d83d609ac4691c8518b5992b0b698f424be0a33212a1d6d5962712614a3a0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-shodan \
python310-shodan \
python3dist-shodan"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-XlsxWriter \
python310-click \
python310-click-plugins \
python310-colorama \
python310-requests \
python310-setuptools \
update-alternatives"

inherit rpm
