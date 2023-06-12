SUMMARY = "DNS record manipulation utility"
DESCRIPTION = "Lexicon provides a way to manipulate DNS records on multiple DNS providers \
in a standardized way. Lexicon has a CLI, but it can also be used as a \
Python library. \
 \
Lexicon was designed to be used in automation, specifically letsencrypt."
LICENSE = "MIT"

PV = "3.11.7"

RPM_NAME = "python311-dns-lexicon-3.11.7-1.1.noarch.rpm"
RPM_HASH = "e29a39a02df400348b56ab18249ed29840143bfc25d05fe1b1a24c1cc534af4a17237b1929cc4c1fe9e1121c8b914f7bd7a85dc0af5d065fa9d4409250a1ea06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dns-lexicon) \
python311-dns-lexicon \
python3dist(dns-lexicon)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-PyYAML \
python311-beautifulsoup4 \
python311-cryptography \
python311-importlib-metadata \
python311-requests \
python311-tldextract \
update-alternatives"

inherit rpm
