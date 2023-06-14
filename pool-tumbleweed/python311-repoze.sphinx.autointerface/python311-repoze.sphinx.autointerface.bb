SUMMARY = "Sphinx extension: auto-generates API docs from Zope interfaces"
DESCRIPTION = "Thie package defines an extension for the Sphinx documentation system. The \
extension allows generation of API documentation by introspection of \
zope.interface instances in code."
LICENSE = "SUSE-Repoze"

PV = "1.0.0"

RPM_NAME = "python311-repoze.sphinx.autointerface-1.0.0-1.3.noarch.rpm"
RPM_HASH = "2cb0190f5328d1d90fcf7915bf5f6517552d171de792dbf9eab24a717754222b9e257ea872de8452b6f31535389ceabd1d4f3ccef2257a1f2b93718449b28b68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-repoze.sphinx.autointerface \
python311-repoze.sphinx.autointerface \
python3dist-repoze.sphinx.autointerface"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-zope.interface"

inherit rpm
