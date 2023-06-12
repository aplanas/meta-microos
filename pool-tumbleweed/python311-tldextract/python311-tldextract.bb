SUMMARY = "Python module to separate the TLD of a URL"
DESCRIPTION = "tldextract accurately separates the gTLD or ccTLD (generic or country code \
top-level domain) from the registered domain and subdomains of a URL, using the \
Public Suffix List. By default, this includes the public ICANN TLDs and their \
exceptions. You can optionally support the Public Suffix List's private domains \
as well."
LICENSE = "BSD-3-Clause"

PV = "3.4.4"

RPM_NAME = "python311-tldextract-3.4.4-1.1.noarch.rpm"
RPM_HASH = "91dcb99f64a22f1551dfabd5679c42af30d55b8db5b3fffc2a0f4c2b1681b9c121432c9b618f8027b4146bb2519281e7f07b06412dc95366d6eec0bdbc56511a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tldextract) \
python311-tldextract \
python3dist(tldextract)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-filelock \
python311-idna \
python311-requests \
python311-requests-file \
update-alternatives"

inherit rpm
