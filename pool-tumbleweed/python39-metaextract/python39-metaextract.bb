SUMMARY = "Module to collect metadata for Python modules"
DESCRIPTION = "metaextract is a tool to collect metadata about a python module. For \
example, it can determine and collect the dependencies of a sdist \
tarball that was retrieved from the Python Package Index. \
 \
The tool was first developed in py2pack but is now its own module."
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python39-metaextract-1.0.9-2.1.noarch.rpm"
RPM_HASH = "ef14ef90173a02732625927966bfa608fa453887d7979a9ba7e14326aeb4ca9af038c475ffed05d170703600e8acce3e7f2c4b34866d04353377d20565b5266e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-metaextract \
python39-metaextract \
python3dist-metaextract"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
