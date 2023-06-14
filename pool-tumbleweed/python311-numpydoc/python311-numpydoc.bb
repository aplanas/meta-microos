SUMMARY = "Sphinx extension to support docstrings in Numpy format"
DESCRIPTION = "Numpy's documentation uses several custom extensions to Sphinx.  These \
are shipped in this numpydoc package, in case you want to make use \
of them in third-party projects."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python311-numpydoc-1.5.0-1.3.noarch.rpm"
RPM_HASH = "bca4f34312f26a72a4466529af6efa158d9569ac984590fd35759f6528575ab3be5ee68622cc2b4fa9cf0b02a150981644ccfba0c7c52f5cced112abb9c938a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-numpydoc \
python311-numpydoc \
python3dist-numpydoc"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-Sphinx"

inherit rpm
