SUMMARY = "Documentation for texlive-ptptex"
DESCRIPTION = "This package includes the documentation for texlive-ptptex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.91svn19440"

RPM_NAME = "texlive-ptptex-doc-2023.209.0.0.91svn19440-54.2.noarch.rpm"
RPM_HASH = "c177b1e3c3f46929eba3fce656482c2cf6be847df4825cd93417a07ddf2373a77c65f9b1cb8fb642b250ff453f34cd1f0218ffe8af4a6b7da808d8921ff5e8d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptptex-doc"

RDEPENDS:${PN} += ""

inherit rpm
