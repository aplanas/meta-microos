SUMMARY = "ICC + CGATS icon"
DESCRIPTION = "The ICC profile and CGATS mime types and a icon for these file types."
LICENSE = "Zlib"

PV = "1.2"

RPM_NAME = "icc-mime-types-1.2-16.21.noarch.rpm"
RPM_HASH = "0c131a6dbc82a4ab00244ba1a224191b8d37094f455a9094581074d90b629d16db911a5f8cd055682ec6631daad4093a3b95e530dc2f6ae0522308e1ec296a3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-mime-types"

RDEPENDS:${PN} += ""

inherit rpm
