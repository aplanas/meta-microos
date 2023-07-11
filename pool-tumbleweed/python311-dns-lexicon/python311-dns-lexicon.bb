SUMMARY = "DNS record manipulation utility"
DESCRIPTION = "Lexicon provides a way to manipulate DNS records on multiple DNS providers \
in a standardized way. Lexicon has a CLI, but it can also be used as a \
Python library. \
 \
Lexicon was designed to be used in automation, specifically letsencrypt."
LICENSE = "MIT"

PV = "3.11.7"

RPM_NAME = "python311-dns-lexicon-3.11.7-2.1.noarch.rpm"
RPM_HASH = "50357b9d6e54a0244ac37b173f8402f3e7e01bbdc8dd7113236210af7218d619194aabd9b326479aa89decc234c29f5456db09702a1fc856a403272d651aa9ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dns-lexicon \
python3.11dist-dns-lexicon \
python311-dns-lexicon \
python3dist-dns-lexicon"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-beautifulsoup4 \
python311-cryptography \
python311-importlib-metadata \
python311-requests \
python311-tldextract \
update-alternatives"

inherit rpm
