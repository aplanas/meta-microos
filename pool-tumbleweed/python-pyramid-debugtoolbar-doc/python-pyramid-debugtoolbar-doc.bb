SUMMARY = "Documentation files for python-pyramid-debugtoolbar"
DESCRIPTION = "Documentation and examples for python-pyramid-debugtoolbar."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "4.10"

RPM_NAME = "python-pyramid-debugtoolbar-doc-4.10-1.5.noarch.rpm"
RPM_HASH = "ca821d508bb07076e4ea4a626175b33c77b88957853ef1460d7ca3ffd070c94fc6d9e190689473cf62fc96149f3b4b2219d3b77787e3af60d7ed7f6345f428bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyramid-debugtoolbar-doc"

RDEPENDS:${PN} += ""

inherit rpm
