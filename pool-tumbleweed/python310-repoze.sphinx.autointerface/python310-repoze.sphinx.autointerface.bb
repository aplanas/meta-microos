SUMMARY = "Sphinx extension: auto-generates API docs from Zope interfaces"
DESCRIPTION = "Thie package defines an extension for the Sphinx documentation system. The \
extension allows generation of API documentation by introspection of \
zope.interface instances in code."
LICENSE = "SUSE-Repoze"

PV = "1.0.0"

RPM_NAME = "python310-repoze.sphinx.autointerface-1.0.0-2.3.noarch.rpm"
RPM_HASH = "7002f427baac4c1b45273a158732b4de6ac81293c4a83b7f64d94500b54aeed805807cf8f5b37fc7e175eefd8e09ce1ca89b1dffc803bc6e68c3e4318536b0b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-repoze.sphinx.autointerface \
python310-repoze.sphinx.autointerface \
python3dist-repoze.sphinx.autointerface"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-zope.interface"

inherit rpm
