SUMMARY = "Sphinx extension: auto-generates API docs from Zope interfaces"
DESCRIPTION = "Thie package defines an extension for the Sphinx documentation system. The \
extension allows generation of API documentation by introspection of \
zope.interface instances in code."
LICENSE = "SUSE-Repoze"

PV = "1.0.0"

RPM_NAME = "python311-repoze.sphinx.autointerface-1.0.0-2.3.noarch.rpm"
RPM_HASH = "5561c8ab22c2d174aa674134921792f602dfa662ce20d0f3b0b60904080dec58a1a3445fda1d94ea83ba028f9984180c2f070a235f85fef84384a255f25b9d64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-repoze.sphinx.autointerface \
python3.11dist-repoze.sphinx.autointerface \
python311-repoze.sphinx.autointerface \
python3dist-repoze.sphinx.autointerface"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-zope.interface"

inherit rpm
