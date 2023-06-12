SUMMARY = "Module to collect metadata for Python modules"
DESCRIPTION = "metaextract is a tool to collect metadata about a python module. For \
example, it can determine and collect the dependencies of a sdist \
tarball that was retrieved from the Python Package Index. \
 \
The tool was first developed in py2pack but is now its own module."
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python39-metaextract-1.0.9-1.4.noarch.rpm"
RPM_HASH = "3214deb0db950b569ad40e57082770d0798e0275ec1e0ce8912268108e83d2aa04d4f522fc0f3614584c91994f9ccfdd5e5a41fa6c0120ba867ea941151531e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(metaextract) \
python39-metaextract \
python3dist(metaextract)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-setuptools \
update-alternatives"

inherit rpm
