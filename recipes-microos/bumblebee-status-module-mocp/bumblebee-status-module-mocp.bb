SUMMARY = "Widget to display information about the current song in moc"
DESCRIPTION = "Displays information about the current song in moc, via mocp. \
 \
Takes one parameter (mocp.format) that formats song information. Tag values can \
be put in curly brackets (i.e. {artist})"
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-mocp-2.1.5-3.3.noarch.rpm"
RPM_HASH = "50538616cb10494c42f35544f0d658d37bcec5aee65fafdf9d49f9be6e011d25eaa7e2a63e63bdf00848db9a5b3ebda14f0d974719e2073f319abdadb93b41d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-mocp"
RDEPENDS:${PN} += "bumblebee-status moc"

inherit rpm
