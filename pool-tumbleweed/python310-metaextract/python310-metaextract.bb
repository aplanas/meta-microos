SUMMARY = "Module to collect metadata for Python modules"
DESCRIPTION = "metaextract is a tool to collect metadata about a python module. For \
example, it can determine and collect the dependencies of a sdist \
tarball that was retrieved from the Python Package Index. \
 \
The tool was first developed in py2pack but is now its own module."
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python310-metaextract-1.0.9-1.4.noarch.rpm"
RPM_HASH = "bfe9198a799f2a686a89e7e9ac1e15acfbdf716c1f33e9fc77dae05ca17c0994ec7d87048e27681e37f004a3d1a1d73d4a0c206fbc6fe12ff34fb085752262f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-metaextract \
python3.10dist-metaextract \
python310-metaextract \
python3dist-metaextract"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
