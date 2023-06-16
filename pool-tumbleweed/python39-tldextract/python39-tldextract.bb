SUMMARY = "Python module to separate the TLD of a URL"
DESCRIPTION = "tldextract accurately separates the gTLD or ccTLD (generic or country code \
top-level domain) from the registered domain and subdomains of a URL, using the \
Public Suffix List. By default, this includes the public ICANN TLDs and their \
exceptions. You can optionally support the Public Suffix List's private domains \
as well."
LICENSE = "BSD-3-Clause"

PV = "3.4.4"

RPM_NAME = "python39-tldextract-3.4.4-1.1.noarch.rpm"
RPM_HASH = "243d3dff0cea4a2b2bcfb2bb2ef7ee003ddf00281ffd04fc279eb91ec6993c4bfa79120ba3295866be915ae5b4906d22eee2c1d2f0bf786b564d48f834254ad8"
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
