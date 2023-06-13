SUMMARY = "HTML Documentation for the GNU C Library"
DESCRIPTION = "This package contains the HTML documentation for the GNU C library. Due \
to a lack of resources, this documentation is not complete and is \
partially out of date."
LICENSE = "GFDL-1.1-only"

PV = "2.37"

RPM_NAME = "glibc-html-2.37-4.1.noarch.rpm"
RPM_HASH = "a0ed2a1f65364834e21e4647cea6732cd210210ed9f1e9e9cb26b98a92438265812fd3e66b82f9cca93fc9251fce35060d5a115d0f1d94411416c025fcb9ae45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-html"

RDEPENDS:${PN} += ""

inherit rpm
