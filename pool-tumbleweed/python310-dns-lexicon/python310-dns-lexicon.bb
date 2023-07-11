SUMMARY = "DNS record manipulation utility"
DESCRIPTION = "Lexicon provides a way to manipulate DNS records on multiple DNS providers \
in a standardized way. Lexicon has a CLI, but it can also be used as a \
Python library. \
 \
Lexicon was designed to be used in automation, specifically letsencrypt."
LICENSE = "MIT"

PV = "3.11.7"

RPM_NAME = "python310-dns-lexicon-3.11.7-2.1.noarch.rpm"
RPM_HASH = "56ad4fa18f11d796a3f79707368c7781bf1e808936b93d38447fb65ce69ed5d76920f34ce066402b4e0c8c22279e7860c9b38cf76a713a01a1cdf182b72c57e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dns-lexicon \
python310-dns-lexicon \
python3dist-dns-lexicon"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-beautifulsoup4 \
python310-cryptography \
python310-importlib-metadata \
python310-requests \
python310-tldextract \
update-alternatives"

inherit rpm
