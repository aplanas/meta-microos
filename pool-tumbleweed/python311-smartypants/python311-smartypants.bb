SUMMARY = "Python fork of perl SmartyPants"
DESCRIPTION = "smartypants is a Python implementation of the perl SmartyPants, \
which translates plain ASCII punctuation characters into smart \
typographic punctuation HTML entities."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python311-smartypants-2.0.1-7.3.noarch.rpm"
RPM_HASH = "16ad76bf218d5e591a041817bcb6768b73f32bac006aeb79c19c89f52c209b9e88b20e37438c44a0698ccef8779afa1b90cb914a4f9800015759b9490331772b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-smartypants \
python3.11dist-smartypants \
python311-smartypants \
python3dist-smartypants"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
