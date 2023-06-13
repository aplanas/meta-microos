SUMMARY = "Math extension for Python-Markdown"
DESCRIPTION = "This extension adds math formulas support to Python-Markdown."
LICENSE = "BSD-3-Clause"

PV = "0.8"

RPM_NAME = "python310-markdown-math-0.8-1.8.noarch.rpm"
RPM_HASH = "383692e5882ce47fac7e023a24e42b987df8c50c349aca702329b4f5940cec86e204164d2560f868fb4d9c1645971cc3ff668dd170b41fca66679f662cdf0f38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-markdown-math \
python3.10dist(python-markdown-math) \
python310-markdown-math \
python3dist(python-markdown-math)"

RDEPENDS:${PN} += "python(abi) \
python310-Markdown"

inherit rpm
