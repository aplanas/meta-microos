SUMMARY = "Math extension for Python-Markdown"
DESCRIPTION = "This extension adds math formulas support to Python-Markdown."
LICENSE = "BSD-3-Clause"

PV = "0.8"

RPM_NAME = "python39-markdown-math-0.8-1.8.noarch.rpm"
RPM_HASH = "ea53ce2ed4c027336c75313c499b86f71bdf141805ddac51c8bd997b377d33c70da946333a613b213dd3b590e01544a4c90c2d727c124200fc484c35c297b224"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-markdown-math) \
python39-markdown-math \
python3dist(python-markdown-math)"
RDEPENDS:${PN} += "python(abi) \
python39-Markdown"

inherit rpm
