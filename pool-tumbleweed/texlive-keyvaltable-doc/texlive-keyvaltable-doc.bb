SUMMARY = "Documentation for texlive-keyvaltable"
DESCRIPTION = "This package includes the documentation for texlive-keyvaltable"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn65416"

RPM_NAME = "texlive-keyvaltable-doc-2023.209.2.3svn65416-56.1.noarch.rpm"
RPM_HASH = "8e043eb6fdaaf5c6b40cc5cc24039feed395a24ab0ef6a873db99f5ed400da221dbe66ed6b94ebd5c8b0f308876424e45dc45a7c44d34246645151156cd7c7ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keyvaltable-doc"

RDEPENDS:${PN} += ""

inherit rpm
