SUMMARY = "Tango Icon Theme"
DESCRIPTION = "This is the Tango base theme. On top of that, the package includes \
some specific icons from the legacy tango-icon-theme-extras package."
LICENSE = "CC-BY-SA-2.5"

PV = "0.8.90"

RPM_NAME = "tango-icon-theme-0.8.90-30.1.noarch.rpm"
RPM_HASH = "9927c11048083ba859219b000b56bccd557d3559977bb9d65806437a9df868feb132f03d7c263aa95b87372235f9e66f9742928cc7700ee3f9350ae6e033ec6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tango-icon-theme"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
