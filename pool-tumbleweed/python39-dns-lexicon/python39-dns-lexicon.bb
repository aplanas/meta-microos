SUMMARY = "DNS record manipulation utility"
DESCRIPTION = "Lexicon provides a way to manipulate DNS records on multiple DNS providers \
in a standardized way. Lexicon has a CLI, but it can also be used as a \
Python library. \
 \
Lexicon was designed to be used in automation, specifically letsencrypt."
LICENSE = "MIT"

PV = "3.12.0"

RPM_NAME = "python39-dns-lexicon-3.12.0-1.1.noarch.rpm"
RPM_HASH = "e4264a1ea6a6c1e87ee2d4bba4d46323bac36197a1893c73822604b4de15bcd3d953db415f70a851e4615ea74b4c5a8a51066dd8bc6653c49ecd5849b6a8b816"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dns-lexicon \
python39-dns-lexicon \
python3dist-dns-lexicon"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-beautifulsoup4 \
python39-cryptography \
python39-importlib-metadata \
python39-requests \
python39-tldextract \
update-alternatives"

inherit rpm
