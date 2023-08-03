SUMMARY = "Documentation for texlive-catoptions"
DESCRIPTION = "This package includes the documentation for texlive-catoptions"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.7hsvn35069"

RPM_NAME = "texlive-catoptions-doc-2023.209.0.0.2.7hsvn35069-53.1.noarch.rpm"
RPM_HASH = "961f370179389ac19315fe47720cc5fe1ed76cfe94bf812e39142debfa535c5407ad68dcd0507ded193efa3312e2b681dbd2c0b9b8963f8d7cad9dbeb13c1a67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-catoptions-doc"

RDEPENDS:${PN} += ""

inherit rpm
