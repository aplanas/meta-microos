SUMMARY = "A code generator for executing Python snippets in source files"
DESCRIPTION = "Cog is a file generation tool. It lets you use pieces of Python code \
as generators in your source files to generate whatever text you \
need."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python39-cogapp-3.3.0-2.1.noarch.rpm"
RPM_HASH = "1665f32d948467084f8b38c3fc0477cd586abd9d9ff631d1ed2735d8ff41945110b99aec9835e2419ab216013f5dd4eb99b20498a7e1e34fd936ca05f7246f8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cogapp \
python39-cogapp \
python3dist-cogapp"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
update-alternatives"

inherit rpm
