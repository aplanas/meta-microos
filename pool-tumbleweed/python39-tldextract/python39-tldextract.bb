SUMMARY = "Python module to separate the TLD of a URL"
DESCRIPTION = "tldextract accurately separates the gTLD or ccTLD (generic or country code \
top-level domain) from the registered domain and subdomains of a URL, using the \
Public Suffix List. By default, this includes the public ICANN TLDs and their \
exceptions. You can optionally support the Public Suffix List's private domains \
as well."
LICENSE = "BSD-3-Clause"

PV = "3.4.4"

RPM_NAME = "python39-tldextract-3.4.4-2.1.noarch.rpm"
RPM_HASH = "8ee22f0e32fa53a36028a7f7a5187af6c66c1654a5f9248324506fd3f66444b3e6cdb1655cd2ad710923999ad5ec55dffe896bad6752eb77256b3a81db0c5129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tldextract \
python39-tldextract \
python3dist-tldextract"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-filelock \
python39-idna \
python39-requests \
python39-requests-file \
update-alternatives"

inherit rpm
