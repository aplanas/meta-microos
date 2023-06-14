SUMMARY = "Python Documentation Utilities"
DESCRIPTION = "Docutils is a modular system for processing documentation into useful formats, \
such as HTML, XML, and LaTeX. For input Docutils supports reStructuredText, an \
easy-to-read, what-you-see-is-what-you-get plaintext markup syntax."
LICENSE = "BSD-2-Clause & Python-2.0 & GPL-2.0-or-later & GPL-3.0-or-later & SUSE-Public-Domain"

PV = "0.19"

RPM_NAME = "python39-docutils-0.19-4.1.noarch.rpm"
RPM_HASH = "24654657ee4bd7cdd87d69a6f48d1a2e051c470488863504f25595c12dffa9582342f92e067517eb3ae9d3eced9a2ec322d076f5574f39f405b116d720e7f5c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-docutils \
python39-docutils \
python3dist-docutils"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-packaging \
python39-xml \
update-alternatives"

inherit rpm
