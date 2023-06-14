SUMMARY = "Sphinx extension: auto-generates API docs from Zope interfaces"
DESCRIPTION = "Thie package defines an extension for the Sphinx documentation system. The \
extension allows generation of API documentation by introspection of \
zope.interface instances in code."
LICENSE = "SUSE-Repoze"

PV = "1.0.0"

RPM_NAME = "python39-repoze.sphinx.autointerface-1.0.0-1.3.noarch.rpm"
RPM_HASH = "c4ffcb732d2798aeb5fca825e3bf950cdffe786bef4b582d584267bdb9042bed3307b3a4b3c5e7089890804c75bf9a07f9ba6c3495483a9fb2a92ab66e168286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-repoze.sphinx.autointerface \
python39-repoze.sphinx.autointerface \
python3dist-repoze.sphinx.autointerface"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-zope.interface"

inherit rpm
