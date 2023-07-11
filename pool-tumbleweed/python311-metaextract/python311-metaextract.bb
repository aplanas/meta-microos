SUMMARY = "Module to collect metadata for Python modules"
DESCRIPTION = "metaextract is a tool to collect metadata about a python module. For \
example, it can determine and collect the dependencies of a sdist \
tarball that was retrieved from the Python Package Index. \
 \
The tool was first developed in py2pack but is now its own module."
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python311-metaextract-1.0.9-2.1.noarch.rpm"
RPM_HASH = "b335382f12b829f76fd5c82ef3763141e5bc17e2279dbe27b8acdaa8cbcbf16e588eadb1d4f80b8cb1fcb1994d3c9d79bdb3ac7d9011210b76e8e1578f1ac5a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-metaextract \
python3.11dist-metaextract \
python311-metaextract \
python3dist-metaextract"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
