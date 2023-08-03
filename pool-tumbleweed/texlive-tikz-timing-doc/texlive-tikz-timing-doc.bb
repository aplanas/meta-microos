SUMMARY = "Documentation for texlive-tikz-timing"
DESCRIPTION = "This package includes the documentation for texlive-tikz-timing"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7fsvn64967"

RPM_NAME = "texlive-tikz-timing-doc-2023.209.0.0.7fsvn64967-53.1.noarch.rpm"
RPM_HASH = "6666fadf7013414ca8a1ca6df3f888df258e3d05ca6ae798e7ac57849aea556d34e5c598608323318eeabdad6067fb8e85572eef37c098c9d39808e071d27a9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-timing-doc"

RDEPENDS:${PN} += ""

inherit rpm
