SUMMARY = "Documentation for texlive-tikz-kalender"
DESCRIPTION = "This package includes the documentation for texlive-tikz-kalender"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4fsvn52890"

RPM_NAME = "texlive-tikz-kalender-doc-2023.209.0.0.4fsvn52890-53.1.noarch.rpm"
RPM_HASH = "ea124f0aca02323405ba1a91c319b174eee4b0d80013785782c017a6f807044c2adac5eea714039cd0bef8044a92f599e20bb1e9f7e9854c3aaeea0d69846b6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-kalender-doc"

RDEPENDS:${PN} += ""

inherit rpm
