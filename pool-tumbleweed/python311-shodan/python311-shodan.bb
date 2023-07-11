SUMMARY = "Python library and command-line utility for Shodan"
DESCRIPTION = "Shodan is a search engine for Internet-connected devices. Google lets you search for websites, Shodan lets you search for devices. This library provides developers easy access to all of the data stored in Shodan in order to automate tasks and integrate into existing tools."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "python311-shodan-1.28.0-1.6.noarch.rpm"
RPM_HASH = "cb27d6d30c50e6d798a53a4eab5e97e393ac841e19cdf2ecd84349dfda643bad9999592da613d3e03b6d618b1431ca4be8581d85a2b2610d7d203f7174d7777e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shodan \
python3.11dist-shodan \
python311-shodan \
python3dist-shodan"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-XlsxWriter \
python311-click \
python311-click-plugins \
python311-colorama \
python311-requests \
python311-setuptools \
update-alternatives"

inherit rpm
