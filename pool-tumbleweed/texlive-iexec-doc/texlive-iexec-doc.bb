SUMMARY = "Documentation for texlive-iexec"
DESCRIPTION = "This package includes the documentation for texlive-iexec"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.11.4svn64908"

RPM_NAME = "texlive-iexec-doc-2023.208.0.0.11.4svn64908-53.1.noarch.rpm"
RPM_HASH = "cd8febdd0067678eeb1f76f344706b6a780aa2b290416ebb55306e36aa84b481bcc48d9c3544390209243acc93f63ab0695b458eed6f802393698951d4555720"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iexec-doc"

RDEPENDS:${PN} += ""

inherit rpm
