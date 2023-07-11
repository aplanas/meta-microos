SUMMARY = "Documentation for dynare in HTML format"
DESCRIPTION = "This package provides documentation for dynare in HTML format."
LICENSE = "GPL-3.0-or-later"

PV = "5.4"

RPM_NAME = "dynare-doc-html-5.4-1.2.noarch.rpm"
RPM_HASH = "661125b416dfa0ddba0b19b009e7781d9817ac955c63ce25bc9ccae8d45807d58a06bc9202c192718f614bd3f3b7e718db3e8852da912ccb966d13255cf2c83a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dynare-doc-html"

RDEPENDS:${PN} += ""

inherit rpm
