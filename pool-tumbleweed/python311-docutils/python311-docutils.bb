SUMMARY = "Python Documentation Utilities"
DESCRIPTION = "Docutils is a modular system for processing documentation into useful formats, \
such as HTML, XML, and LaTeX. For input Docutils supports reStructuredText, an \
easy-to-read, what-you-see-is-what-you-get plaintext markup syntax."
LICENSE = "BSD-2-Clause & Python-2.0 & GPL-2.0-or-later & GPL-3.0-or-later & SUSE-Public-Domain"

PV = "0.19"

RPM_NAME = "python311-docutils-0.19-4.3.noarch.rpm"
RPM_HASH = "1f0bd3c9dee40ccf8c92b574bf88a0b887727a07fbd6cc26de2e2268105cad0de118e0bdbe586c7847f67ba43ef97f07d9f6711a7590c6c5bcd64dbd88a01506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docutils \
python3-docutils \
python3.11dist-docutils \
python311-docutils \
python3dist-docutils"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-packaging \
python311-xml \
update-alternatives"

inherit rpm
