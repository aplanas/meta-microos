SUMMARY = "Module to collect metadata for Python modules"
DESCRIPTION = "metaextract is a tool to collect metadata about a python module. For \
example, it can determine and collect the dependencies of a sdist \
tarball that was retrieved from the Python Package Index. \
 \
The tool was first developed in py2pack but is now its own module."
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python310-metaextract-1.0.9-2.1.noarch.rpm"
RPM_HASH = "48912e2734bf7a118c8d67ffefe5de94088b55ad516fb5a6ae19e3bcf67e5a4f4ad97593f3c0ef842f53522305d96c0efc9e8450a5dacde627d2778d67759232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-metaextract \
python310-metaextract \
python3dist-metaextract"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
