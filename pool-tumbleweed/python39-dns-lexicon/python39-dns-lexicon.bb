SUMMARY = "DNS record manipulation utility"
DESCRIPTION = "Lexicon provides a way to manipulate DNS records on multiple DNS providers \
in a standardized way. Lexicon has a CLI, but it can also be used as a \
Python library. \
 \
Lexicon was designed to be used in automation, specifically letsencrypt."
LICENSE = "MIT"

PV = "3.11.7"

RPM_NAME = "python39-dns-lexicon-3.11.7-1.1.noarch.rpm"
RPM_HASH = "b0e3af0decf5a8c6aaf5a29f63ac9313b804fa70f11f69e1dd2e248ac59c4cca2e40e4de5c136cab88c86db62f8feaa3334528a3e291814d051fcbec9684ca3a"
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
