SUMMARY = "Python module to separate the TLD of a URL"
DESCRIPTION = "tldextract accurately separates the gTLD or ccTLD (generic or country code \
top-level domain) from the registered domain and subdomains of a URL, using the \
Public Suffix List. By default, this includes the public ICANN TLDs and their \
exceptions. You can optionally support the Public Suffix List's private domains \
as well."
LICENSE = "BSD-3-Clause"

PV = "3.4.4"

RPM_NAME = "python310-tldextract-3.4.4-2.1.noarch.rpm"
RPM_HASH = "5bbdf65565fd487ec13553880f44a29c6e7d4cb74c380c2e70deca27417c22a5a0bb54b5ef463727053f4e7106f648c8ef708abe796caf4f3fc82b08fa9ddb75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tldextract \
python310-tldextract \
python3dist-tldextract"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-filelock \
python310-idna \
python310-requests \
python310-requests-file \
update-alternatives"

inherit rpm
