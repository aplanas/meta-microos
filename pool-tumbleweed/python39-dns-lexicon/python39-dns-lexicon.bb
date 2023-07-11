SUMMARY = "DNS record manipulation utility"
DESCRIPTION = "Lexicon provides a way to manipulate DNS records on multiple DNS providers \
in a standardized way. Lexicon has a CLI, but it can also be used as a \
Python library. \
 \
Lexicon was designed to be used in automation, specifically letsencrypt."
LICENSE = "MIT"

PV = "3.11.7"

RPM_NAME = "python39-dns-lexicon-3.11.7-2.1.noarch.rpm"
RPM_HASH = "2c9599021fd2517d305822b00350944b55057c7d2bb23fafd342ba492bd8047cce44088b1dda7bd1fe1b10ef36c1d7608ce2b84053e1e1b725f47be48b4ae443"
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
