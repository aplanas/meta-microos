SUMMARY = "Module to collect metadata for Python modules"
DESCRIPTION = "metaextract is a tool to collect metadata about a python module. For \
example, it can determine and collect the dependencies of a sdist \
tarball that was retrieved from the Python Package Index. \
 \
The tool was first developed in py2pack but is now its own module."
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python311-metaextract-1.0.9-1.4.noarch.rpm"
RPM_HASH = "f8116f19d5fe9893ad27f1774a9552b55347d799209d1b6cf92824c974942c26e43f8f8e84faea07bc9013b7bdbfd61b6e1b4d120f4c4c8cc9cfc9d173b4e58f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(metaextract) \
python311-metaextract \
python3dist(metaextract)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-setuptools \
update-alternatives"

inherit rpm
