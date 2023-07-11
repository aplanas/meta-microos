SUMMARY = "Math extension for Python-Markdown"
DESCRIPTION = "This extension adds math formulas support to Python-Markdown."
LICENSE = "BSD-3-Clause"

PV = "0.8"

RPM_NAME = "python310-markdown-math-0.8-1.10.noarch.rpm"
RPM_HASH = "ae99f78dcbe7884cb9031aef8c4fb2920fdf0fd65d5f6085120e5e2cc61eefd3f2029dd76511e7b7614b2c1827a834e8fa2940675025c556c82a0a3bc3988f4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-markdown-math \
python310-markdown-math \
python3dist-python-markdown-math"

RDEPENDS:${PN} += "python-abi \
python310-Markdown"

inherit rpm
