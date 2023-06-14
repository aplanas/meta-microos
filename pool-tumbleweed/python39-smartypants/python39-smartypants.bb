SUMMARY = "Python fork of perl SmartyPants"
DESCRIPTION = "smartypants is a Python implementation of the perl SmartyPants, \
which translates plain ASCII punctuation characters into smart \
typographic punctuation HTML entities."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python39-smartypants-2.0.1-7.1.noarch.rpm"
RPM_HASH = "0ef5b60af7072ffb7a4419c08c9737763aa220543b90bfb8a8eb1e5b63b75cd4386a3b461a9d588d6e098eb22e1c8be728f65137f408af6e7b97c2825d253c4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-smartypants \
python39-smartypants \
python3dist-smartypants"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
update-alternatives"

inherit rpm
