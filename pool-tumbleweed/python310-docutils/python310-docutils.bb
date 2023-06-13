SUMMARY = "Python Documentation Utilities"
DESCRIPTION = "Docutils is a modular system for processing documentation into useful formats, \
such as HTML, XML, and LaTeX. For input Docutils supports reStructuredText, an \
easy-to-read, what-you-see-is-what-you-get plaintext markup syntax."
LICENSE = "BSD-2-Clause & Python-2.0 & GPL-2.0-or-later & GPL-3.0-or-later & SUSE-Public-Domain"

PV = "0.19"

RPM_NAME = "python310-docutils-0.19-4.1.noarch.rpm"
RPM_HASH = "b8c4c4aa176d7f85baa47359345bbf6988338999c7f783ae48dba1c44df02798898ab12357676bd9851dd82f045e03b087ba1d00e9dfa5bf6be4e2d8a106c0bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docutils \
python3-docutils \
python3.10dist(docutils) \
python310-docutils \
python3dist(docutils)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-packaging \
python310-xml \
update-alternatives"

inherit rpm
