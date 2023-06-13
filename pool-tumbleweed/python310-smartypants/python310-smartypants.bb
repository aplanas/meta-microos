SUMMARY = "Python fork of perl SmartyPants"
DESCRIPTION = "smartypants is a Python implementation of the perl SmartyPants, \
which translates plain ASCII punctuation characters into smart \
typographic punctuation HTML entities."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python310-smartypants-2.0.1-7.1.noarch.rpm"
RPM_HASH = "556291f45fa4f92e27aab4d1b03067a2d37387508a3c12159a766139636dfa8ef8032e9177208a8e4626b2ebe8d162873b0337c31678cd8460313bdfc0e5b97b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-smartypants \
python3.10dist(smartypants) \
python310-smartypants \
python3dist(smartypants)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
