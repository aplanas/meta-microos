SUMMARY = "Build tested documentation"
DESCRIPTION = "This package contains documentation files for python311-manuel."
LICENSE = "Apache-2.0"

PV = "1.12.4"

RPM_NAME = "python311-manuel-doc-1.12.4-4.2.noarch.rpm"
RPM_HASH = "726639e1d4bc2bfd55f598776a0cad665b65d230aa8ae7edd3f96a64fa4505a740eab2cbdc787f5266b60e033c9a460b6735833174d8480b4324170b2bece514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-manuel-doc \
python311-manuel-doc"

RDEPENDS:${PN} += ""

inherit rpm
