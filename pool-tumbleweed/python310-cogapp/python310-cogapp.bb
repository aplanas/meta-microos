SUMMARY = "A code generator for executing Python snippets in source files"
DESCRIPTION = "Cog is a file generation tool. It lets you use pieces of Python code \
as generators in your source files to generate whatever text you \
need."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python310-cogapp-3.3.0-2.3.noarch.rpm"
RPM_HASH = "7a514f43300d24220be535053de41f42a78b5bfc5f742896e90db4a4606edfd9a93ba2799e0f6ff1c5b983738cfe65d0e5a9e0acd8711b55266e4a200d577697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cogapp \
python310-cogapp \
python3dist-cogapp"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
