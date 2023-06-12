SUMMARY = "Sphinx contrib extension to generate html help files"
DESCRIPTION = "Html help generating extension."
LICENSE = "BSD-2-Clause"

PV = "2.0.1"

RPM_NAME = "python39-sphinxcontrib-htmlhelp-2.0.1-2.1.noarch.rpm"
RPM_HASH = "6a4718d9f4ea0c0797d5e256846197df107425234f43adff5b8066cb6b98560f2f4eebffa16245ee995c2de3b8003f5fa78cbfa9443485ae0c7bc423d0b2ff3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxcontrib-htmlhelp) \
python39-sphinxcontrib-htmlhelp \
python3dist(sphinxcontrib-htmlhelp)"
RDEPENDS:${PN} += "python(abi) \
python39-Sphinx"

inherit rpm
