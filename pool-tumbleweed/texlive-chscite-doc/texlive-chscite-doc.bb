SUMMARY = "Documentation for texlive-chscite"
DESCRIPTION = "This package includes the documentation for texlive-chscite"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.9999svn28552"

RPM_NAME = "texlive-chscite-doc-2023.209.2.9999svn28552-54.1.noarch.rpm"
RPM_HASH = "0c5d03ae06715126351896b63258f8276d432493850e016290d4242752ce63ca3c314cc0f1b6faee284d3f8c46aba8c5215b8404a462a62808fd57c8abdffda5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chscite-doc"

RDEPENDS:${PN} += ""

inherit rpm
