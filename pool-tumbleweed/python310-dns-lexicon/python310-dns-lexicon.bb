SUMMARY = "DNS record manipulation utility"
DESCRIPTION = "Lexicon provides a way to manipulate DNS records on multiple DNS providers \
in a standardized way. Lexicon has a CLI, but it can also be used as a \
Python library. \
 \
Lexicon was designed to be used in automation, specifically letsencrypt."
LICENSE = "MIT"

PV = "3.12.0"

RPM_NAME = "python310-dns-lexicon-3.12.0-1.1.noarch.rpm"
RPM_HASH = "e252b5044689c07acdd9150bec745a7fb18842da91573143b2f82a33b67d33cc00d904bb588b8041064e1a69dd620394a971ed43f21e24651fcef97fb81c5fd2"
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
