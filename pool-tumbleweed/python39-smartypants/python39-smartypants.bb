SUMMARY = "Python fork of perl SmartyPants"
DESCRIPTION = "smartypants is a Python implementation of the perl SmartyPants, \
which translates plain ASCII punctuation characters into smart \
typographic punctuation HTML entities."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python39-smartypants-2.0.1-7.3.noarch.rpm"
RPM_HASH = "0c3760f995fe4451d1b89b3f851f89fec78e8aacbfe46725951e6e6fa77c5e30db17193a47bf8bb55a30c94c1c2b5d15a22027a1b1f7cf741c656225266e96c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-smartypants \
python39-smartypants \
python3dist-smartypants"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
