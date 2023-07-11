SUMMARY = "Python Documentation Utilities"
DESCRIPTION = "Docutils is a modular system for processing documentation into useful formats, \
such as HTML, XML, and LaTeX. For input Docutils supports reStructuredText, an \
easy-to-read, what-you-see-is-what-you-get plaintext markup syntax."
LICENSE = "BSD-2-Clause & Python-2.0 & GPL-2.0-or-later & GPL-3.0-or-later & SUSE-Public-Domain"

PV = "0.19"

RPM_NAME = "python39-docutils-0.19-4.3.noarch.rpm"
RPM_HASH = "ef26e14fe6213de4949cc1db0e7c4cf5de7636984bb5d70a4b0f8ed64ae16967531a76883cffc0be7beb10d36d6a5606dd135d80ab30f0bba19627cf9e9b2ec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-docutils \
python39-docutils \
python3dist-docutils"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-packaging \
python39-xml \
update-alternatives"

inherit rpm
