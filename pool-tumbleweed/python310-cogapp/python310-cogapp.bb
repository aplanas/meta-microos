SUMMARY = "A code generator for executing Python snippets in source files"
DESCRIPTION = "Cog is a file generation tool. It lets you use pieces of Python code \
as generators in your source files to generate whatever text you \
need."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python310-cogapp-3.3.0-2.1.noarch.rpm"
RPM_HASH = "9dca01b7c839b3ba0ce5b0ebc9ff9941d24948b7cdad577aa13ce18545486f259d6016fe928a258183715b69a1a67440f02ab1f6a10502c7292482de2b7e2013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cogapp \
python3.10dist(cogapp) \
python310-cogapp \
python3dist(cogapp)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
