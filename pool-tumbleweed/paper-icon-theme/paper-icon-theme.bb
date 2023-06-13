SUMMARY = "Paper Icon theme"
DESCRIPTION = "Paper is a simple and modern icon theme with Material Design influences."
LICENSE = "CC-BY-SA-4.0"

PV = "1.5.0+git32.aa3e8af7"

RPM_NAME = "paper-icon-theme-1.5.0+git32.aa3e8af7-1.7.noarch.rpm"
RPM_HASH = "730126cf385fdd84a368345f9231e99d3c03e02d60e0f19b7749d7119e00f301da56254593a77cae360168bbb4794614cdb41068954533337dd44c6af59f93be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "paper-icon-theme"

RDEPENDS:${PN} += ""

inherit rpm
