SUMMARY = "Documentation for texlive-lato"
DESCRIPTION = "This package includes the documentation for texlive-lato"
LICENSE = "OFL-1.1"

PV = "2023.201.3.3svn54512"

RPM_NAME = "texlive-lato-doc-2023.201.3.3svn54512-54.1.noarch.rpm"
RPM_HASH = "8e66237292e0413bf85a00ba37b46eaa2117bf97c44e3d5b029547e2a6265a01c2b2b41246509f2b6e41ecc4f0d849465458ea0f350187977cf3f78c15b58121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lato-doc"

RDEPENDS:${PN} += ""

inherit rpm
