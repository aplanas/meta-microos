SUMMARY = "Sphinx extension: auto-generates API docs from Zope interfaces"
DESCRIPTION = "Thie package defines an extension for the Sphinx documentation system. The \
extension allows generation of API documentation by introspection of \
zope.interface instances in code."
LICENSE = "SUSE-Repoze"

PV = "1.0.0"

RPM_NAME = "python310-repoze.sphinx.autointerface-1.0.0-1.3.noarch.rpm"
RPM_HASH = "01864f5547554416018e3e5b80daffa23c1226150325cec5aadcc8be37756f6d4b223d3507b3ddb10685742e68e30c978b3c3ca79f0af45eeb8913dad35c3cd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-repoze.sphinx.autointerface \
python3.10dist-repoze.sphinx.autointerface \
python310-repoze.sphinx.autointerface \
python3dist-repoze.sphinx.autointerface"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-zope.interface"

inherit rpm
