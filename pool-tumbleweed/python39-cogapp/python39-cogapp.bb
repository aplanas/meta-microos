SUMMARY = "A code generator for executing Python snippets in source files"
DESCRIPTION = "Cog is a file generation tool. It lets you use pieces of Python code \
as generators in your source files to generate whatever text you \
need."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python39-cogapp-3.3.0-2.3.noarch.rpm"
RPM_HASH = "32650eb9495d44d783c365e063568c698a4560ce3033b1084f82c32939bf450b9c2d20072344102669c4b01859c56d7e0037e92f3a1190fbe6caafc97f8c2abf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cogapp \
python39-cogapp \
python3dist-cogapp"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
