SUMMARY = "Provides a sphinx code-block for rendering RunThis blocks"
DESCRIPTION = "This provides a sphinx extension that adds RunThis code blocks, \
which display a highligthed code-block statically, but with a \
'RunThis' button above them. When the button is clicked, the code \
block is replaced by a terminal session that has executed that \
code."
LICENSE = "BSD-3-Clause"

PV = "0.0.3"

RPM_NAME = "python39-runthis-sphinxext-0.0.3-1.13.noarch.rpm"
RPM_HASH = "93abd2ce9021850e8647216536674ec560c52d63ab7223e4c26acd28ac01b9240100d8aabf6d5729af5a886383ad4ee93c28d76dd5893a5b73659ab4a34656a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-runthis-sphinxext \
python39-runthis-sphinxext \
python3dist-runthis-sphinxext"

RDEPENDS:${PN} += "python-abi"

inherit rpm
