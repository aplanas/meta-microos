SUMMARY = "Documentation of the Calligra Suite"
DESCRIPTION = "Documentation of the Calligra Office Suite applications."
LICENSE = "GFDL-1.2-only"

PV = "3.2.1"

RPM_NAME = "calligra-doc-3.2.1-7.21.noarch.rpm"
RPM_HASH = "735411890dcd594446117c8cfbd397f6db6c7eebb9a39739330d6c576a57423c4ef38e3563d6efcbd1d1be034d5d14bcb9b22db0a1fd4e061b220af2e626a575"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calligra-doc"

RDEPENDS:${PN} += "calligra"

inherit rpm
