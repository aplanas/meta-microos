SUMMARY = "Documentation for texlive-stanli"
DESCRIPTION = "This package includes the documentation for texlive-stanli"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.0svn54512"

RPM_NAME = "texlive-stanli-doc-2023.201.3.0svn54512-57.1.noarch.rpm"
RPM_HASH = "32992931c69a48f1c19bb53d747f3dec7fe4a4da47bccbc488406fe2b399af609d466fff7188eb54cca8e9291ae1cd8bd2c51343664a76324a0d671cfdf4b4a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stanli-doc"

RDEPENDS:${PN} += ""

inherit rpm
