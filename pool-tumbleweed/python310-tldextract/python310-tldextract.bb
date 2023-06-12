SUMMARY = "Python module to separate the TLD of a URL"
DESCRIPTION = "tldextract accurately separates the gTLD or ccTLD (generic or country code \
top-level domain) from the registered domain and subdomains of a URL, using the \
Public Suffix List. By default, this includes the public ICANN TLDs and their \
exceptions. You can optionally support the Public Suffix List's private domains \
as well."
LICENSE = "BSD-3-Clause"

PV = "3.4.4"

RPM_NAME = "python310-tldextract-3.4.4-1.1.noarch.rpm"
RPM_HASH = "e6b1e9cf762a48d9ecddabb34914245ed3a9cb2b9f015f7aa405e9cd620897a40c09ad6bfa8f5feaf83aa78dbb2009a3fe5771cbfdb40269143c1ad43d6dcbfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tldextract \
python3.10dist(tldextract) \
python310-tldextract \
python3dist(tldextract)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-filelock \
python310-idna \
python310-requests \
python310-requests-file \
update-alternatives"

inherit rpm
