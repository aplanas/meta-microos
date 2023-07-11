SUMMARY = "Math extension for Python-Markdown"
DESCRIPTION = "This extension adds math formulas support to Python-Markdown."
LICENSE = "BSD-3-Clause"

PV = "0.8"

RPM_NAME = "python39-markdown-math-0.8-1.10.noarch.rpm"
RPM_HASH = "6921954488fe1cb2886cd366378eecfe46048f39cec914ed5450ccbca6dadacd8f829d546581a4447956143daca8aedfc06946a05104d459e32541c63f677694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-markdown-math \
python39-markdown-math \
python3dist-python-markdown-math"

RDEPENDS:${PN} += "python-abi \
python39-Markdown"

inherit rpm
