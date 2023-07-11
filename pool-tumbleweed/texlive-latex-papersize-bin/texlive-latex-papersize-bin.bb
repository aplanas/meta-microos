SUMMARY = "Binary files of latex-papersize"
DESCRIPTION = "Binary files of latex-papersize"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn42296"

RPM_NAME = "texlive-latex-papersize-bin-2023.20230311.svn42296-92.1.aarch64.rpm"
RPM_HASH = "24028ca826bb7dd17c48b349c39de8b366bbf039945746e833004af34c61358dce495a8fe9ef1d4044894ab9b6acdc8a112a855ddccdf1de85ef3c334f485b99"

RPROVIDES:${PN} += "texlive-latex-papersize-bin"

RDEPENDS:${PN} += "texlive-latex-papersize"

inherit rpm
