SUMMARY = "Python fork of perl SmartyPants"
DESCRIPTION = "smartypants is a Python implementation of the perl SmartyPants, \
which translates plain ASCII punctuation characters into smart \
typographic punctuation HTML entities."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python311-smartypants-2.0.1-7.1.noarch.rpm"
RPM_HASH = "8a30bbcc27ef8585529cd28bfd4ba3dcf330532a436f5f3841c30dc419e9b47777b96512915847c77a0686948602858c3178d934e5517229cbcc1a885cfe5cec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-smartypants \
python311-smartypants \
python3dist-smartypants"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
update-alternatives"

inherit rpm
