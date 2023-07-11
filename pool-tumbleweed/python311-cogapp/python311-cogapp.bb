SUMMARY = "A code generator for executing Python snippets in source files"
DESCRIPTION = "Cog is a file generation tool. It lets you use pieces of Python code \
as generators in your source files to generate whatever text you \
need."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python311-cogapp-3.3.0-2.3.noarch.rpm"
RPM_HASH = "990ecf1b99167c2cb9c6c4d29eb88ee71230d72f20c60a8c4ffc14c7530abd741d5697cb7e8d620da6c1a939b4ecb4c1cb8c662d054716d8e5c2dbea73f76371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cogapp \
python3.11dist-cogapp \
python311-cogapp \
python3dist-cogapp"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
