SUMMARY = "A tool for discovering and downloading publicly available satellite imagery"
DESCRIPTION = "Sat-search is a Python 3 library and a command line tool for discovering \
and downloading publicly available satellite imagery using a conformant \
API such as sat-api."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-sat-search-0.3.0-1.4.noarch.rpm"
RPM_HASH = "bfd9d46280245f8542d1e3901568f7a56eaecb7eb908124b65667c007225a8a5236bc9391f93b3a5ed18ae258b3ee073b91f96d018ea966a841c12d551d1e3b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sat-search \
python39-sat-search \
python3dist-sat-search"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-sat-stac \
update-alternatives"

inherit rpm
