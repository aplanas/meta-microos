SUMMARY = "DNS record manipulation utility"
DESCRIPTION = "Lexicon provides a way to manipulate DNS records on multiple DNS providers \
in a standardized way. Lexicon has a CLI, but it can also be used as a \
Python library. \
 \
Lexicon was designed to be used in automation, specifically letsencrypt."
LICENSE = "MIT"

PV = "3.12.0"

RPM_NAME = "python311-dns-lexicon-3.12.0-1.1.noarch.rpm"
RPM_HASH = "be894a374e9e08141623fe08f08ab695cc7998a8ee2bd963c36e6576ccf04016f6efe45a689c1ec4655b9cbd16a57d9cf80623346eba5a176952c4135afcc59c"
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
