SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "2.6.0"

RPM_NAME = "mathjax-winie6-fonts-2.6.0-3.6.noarch.rpm"
RPM_HASH = "a17d14a101a1ad4b6e8c47af32e538c6d63dc18fcda17838b6c9e62b9ba12dae02705205de5640bb51256ee40bdb21554aa502bc0a5cd37b876d12b4fcfb84df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-winie6-fonts"

RDEPENDS:${PN} += ""

inherit rpm
