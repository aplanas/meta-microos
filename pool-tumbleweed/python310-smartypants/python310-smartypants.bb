SUMMARY = "Python fork of perl SmartyPants"
DESCRIPTION = "smartypants is a Python implementation of the perl SmartyPants, \
which translates plain ASCII punctuation characters into smart \
typographic punctuation HTML entities."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python310-smartypants-2.0.1-7.3.noarch.rpm"
RPM_HASH = "defd98be3df3a0dd7572d0cc1cdf602f287a9c90d553400141903dfd115fe04762ba3a2bc5e48bfcf780ecbd163c3d10cce8baedac6b40b7aa27051c0d4a012b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-smartypants \
python310-smartypants \
python3dist-smartypants"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
