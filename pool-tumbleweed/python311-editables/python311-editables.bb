SUMMARY = "Editable installations"
DESCRIPTION = "A Python library for creating 'editable wheels' \
 \
This library supports the building of wheels which, when installed, will expose \
packages in a local directory on sys.path in 'editable mode'. In other words, \
changes to the package source will be reflected in the package visible to \
Python, without needing a reinstall."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python311-editables-0.5-1.1.noarch.rpm"
RPM_HASH = "5988ed42c21aa7b670b18e8b192193d29c4d74d93da24f443bf928327741dc891367ab6cfbf35aa66aa5d8ff599025c98b9288354bacf3050b1cfa69fdfe6136"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-editables \
python3.11dist-editables \
python311-editables \
python3dist-editables"

RDEPENDS:${PN} += "python-abi"

inherit rpm
