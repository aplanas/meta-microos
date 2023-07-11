SUMMARY = "Python Documentation Utilities"
DESCRIPTION = "Docutils is a modular system for processing documentation into useful formats, \
such as HTML, XML, and LaTeX. For input Docutils supports reStructuredText, an \
easy-to-read, what-you-see-is-what-you-get plaintext markup syntax."
LICENSE = "BSD-2-Clause & Python-2.0 & GPL-2.0-or-later & GPL-3.0-or-later & SUSE-Public-Domain"

PV = "0.19"

RPM_NAME = "python310-docutils-0.19-4.3.noarch.rpm"
RPM_HASH = "33a0a80ac802cabf3c6744fdeb70d87f8400990679c62cac46c9c7d01dea5bba7186059614df577bb0c48b55e7e2d74cb1f4316d30f531cd57d742044748309a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-docutils \
python310-docutils \
python3dist-docutils"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-packaging \
python310-xml \
update-alternatives"

inherit rpm
