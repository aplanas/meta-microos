SUMMARY = "Sphinx extension to support docstrings in Numpy format"
DESCRIPTION = "Numpy's documentation uses several custom extensions to Sphinx.  These \
are shipped in this numpydoc package, in case you want to make use \
of them in third-party projects."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python311-numpydoc-1.5.0-1.5.noarch.rpm"
RPM_HASH = "5e87e783561265ab4a77380a9f829fb18cff25a871c49942e10c44b51235dd6e12a00882aa13338abb51dcef67aa70b58bdbfec3e9d677b02d3c3181a8f00ce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-numpydoc \
python3.11dist-numpydoc \
python311-numpydoc \
python3dist-numpydoc"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-Sphinx"

inherit rpm
