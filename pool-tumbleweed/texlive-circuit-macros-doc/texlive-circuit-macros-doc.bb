SUMMARY = "Documentation for texlive-circuit-macros"
DESCRIPTION = "This package includes the documentation for texlive-circuit-macros"
LICENSE = "LPPL-1.0"

PV = "2023.209.10.2svn66549"

RPM_NAME = "texlive-circuit-macros-doc-2023.209.10.2svn66549-54.1.noarch.rpm"
RPM_HASH = "4d03deec18296a07f1a8b6587abd5c9f947125ec943e14b793242ca84522307751eaeff745b7f80769a600634b2f63672dfa76730e2ddeff718cb2a2b1613a4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-circuit-macros-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
