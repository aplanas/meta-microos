SUMMARY = "Editable installations"
DESCRIPTION = "A Python library for creating 'editable wheels' \
 \
This library supports the building of wheels which, when installed, will expose \
packages in a local directory on sys.path in 'editable mode'. In other words, \
changes to the package source will be reflected in the package visible to \
Python, without needing a reinstall."
LICENSE = "MIT"

PV = "0.3"

RPM_NAME = "python311-editables-0.3-2.1.noarch.rpm"
RPM_HASH = "aef4d9c74e30ce18e1394a6c613d50e47041f68a5b4ded98f5a1872592e29c31d344b47f31f690ec77351d0ef9b46ccc82d7392a92bf8fc95d9dc8921056d1a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(editables) \
python311-editables \
python3dist(editables)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
