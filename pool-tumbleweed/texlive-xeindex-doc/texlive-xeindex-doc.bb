SUMMARY = "Documentation for texlive-xeindex"
DESCRIPTION = "This package includes the documentation for texlive-xeindex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn35756"

RPM_NAME = "texlive-xeindex-doc-2023.209.0.0.3svn35756-53.1.noarch.rpm"
RPM_HASH = "de36e26697d15ca074631d412d6c65cf7fbcf9e2037197f13a1dce30eb7adbea5da182700f40bbcfdd705a4186a18c8f0aa5c5cfbf40ea85bb19ce87a2dc4e0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xeindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
