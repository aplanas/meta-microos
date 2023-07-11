SUMMARY = "Python module to separate the TLD of a URL"
DESCRIPTION = "tldextract accurately separates the gTLD or ccTLD (generic or country code \
top-level domain) from the registered domain and subdomains of a URL, using the \
Public Suffix List. By default, this includes the public ICANN TLDs and their \
exceptions. You can optionally support the Public Suffix List's private domains \
as well."
LICENSE = "BSD-3-Clause"

PV = "3.4.4"

RPM_NAME = "python311-tldextract-3.4.4-2.1.noarch.rpm"
RPM_HASH = "e8e359b5df328f692cd157703c08983620a162fc1e3157f6987cfd8338847f5d52edeca438b59ca1d26060663e357d05a4d61344e7f62bd191a8d0d04585e1be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tldextract \
python3.11dist-tldextract \
python311-tldextract \
python3dist-tldextract"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-filelock \
python311-idna \
python311-requests \
python311-requests-file \
update-alternatives"

inherit rpm
