SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "2.6.0"

RPM_NAME = "mathjax-size4-fonts-2.6.0-3.6.noarch.rpm"
RPM_HASH = "125e786632974f8ee995c647c538ebfa615baee9ae6f8c5e2e7c391a622ad57f1646dcb377c9c487bd949b531cbdffeef10d9fb7368414799988ee370bf21a30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-size4-fonts"

RDEPENDS:${PN} += ""

inherit rpm
