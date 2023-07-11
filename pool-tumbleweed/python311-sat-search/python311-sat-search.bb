SUMMARY = "A tool for discovering and downloading publicly available satellite imagery"
DESCRIPTION = "Sat-search is a Python 3 library and a command line tool for discovering \
and downloading publicly available satellite imagery using a conformant \
API such as sat-api."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-sat-search-0.3.0-1.6.noarch.rpm"
RPM_HASH = "e5a43d37dc7631410d0388bee47167313f3307cecadc83bf4493bc0c3bd6c264de44c2582bcd2897a8b6364d36a185377851808f55613b927abff229e6bbdc54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sat-search \
python3.11dist-sat-search \
python311-sat-search \
python3dist-sat-search"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-sat-stac \
update-alternatives"

inherit rpm
