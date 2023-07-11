SUMMARY = "A tool for discovering and downloading publicly available satellite imagery"
DESCRIPTION = "Sat-search is a Python 3 library and a command line tool for discovering \
and downloading publicly available satellite imagery using a conformant \
API such as sat-api."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-sat-search-0.3.0-1.6.noarch.rpm"
RPM_HASH = "5b7a4ddf015121e1729e076a66f27cf9fa3e8264946e69d4475703ceb4a9ca92ffca6aae8f5adc79ab8e6e6b9ee749eb42d7630b618b375c7c93f4d75b340819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sat-search \
python310-sat-search \
python3dist-sat-search"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-sat-stac \
update-alternatives"

inherit rpm
