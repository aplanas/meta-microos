SUMMARY = "Documentation for texlive-anyfontsize"
DESCRIPTION = "This package includes the documentation for texlive-anyfontsize"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17050"

RPM_NAME = "texlive-anyfontsize-doc-2023.201.svn17050-54.1.noarch.rpm"
RPM_HASH = "fb6c6215756abe3529908b17cbc88432540b6f6ab6002d5b5ac43152db8bac96d9888f84e2e44dac0a4f25c4a2ce276e653e3202d2287f38713f3097a58ef5e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-anyfontsize-doc"
RDEPENDS:${PN} += ""

inherit rpm
