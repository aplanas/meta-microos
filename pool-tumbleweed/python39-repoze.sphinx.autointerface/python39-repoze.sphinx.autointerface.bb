SUMMARY = "Sphinx extension: auto-generates API docs from Zope interfaces"
DESCRIPTION = "Thie package defines an extension for the Sphinx documentation system. The \
extension allows generation of API documentation by introspection of \
zope.interface instances in code."
LICENSE = "SUSE-Repoze"

PV = "1.0.0"

RPM_NAME = "python39-repoze.sphinx.autointerface-1.0.0-2.3.noarch.rpm"
RPM_HASH = "819502f16293b7400ab5f8bb4cd94398f5693df852c914308f0c3dc0c6d9d81d2921d6f25eaad5e6d44f771a6ec5460ea8d1a808d3ded076ebd5897555cdec1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-repoze.sphinx.autointerface \
python39-repoze.sphinx.autointerface \
python3dist-repoze.sphinx.autointerface"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-zope.interface"

inherit rpm
