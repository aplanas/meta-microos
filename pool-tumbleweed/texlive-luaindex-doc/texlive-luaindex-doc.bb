SUMMARY = "Documentation for texlive-luaindex"
DESCRIPTION = "This package includes the documentation for texlive-luaindex"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1bsvn25882"

RPM_NAME = "texlive-luaindex-doc-2023.208.0.0.1bsvn25882-53.1.noarch.rpm"
RPM_HASH = "e342ffd74441400719436538ae8fc1bae8bd000a76a20dff4556e9ca3b6fae4846a0cf4e65305104d1f960ebdffaf6e864afad103710a51b6ca4df0f696a7f13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
