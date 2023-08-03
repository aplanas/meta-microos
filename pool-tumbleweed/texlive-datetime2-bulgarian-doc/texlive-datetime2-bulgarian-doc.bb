SUMMARY = "Documentation for texlive-datetime2-bulgarian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-bulgarian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47031"

RPM_NAME = "texlive-datetime2-bulgarian-doc-2023.209.1.1svn47031-53.1.noarch.rpm"
RPM_HASH = "fe15750a57362af9aa08af603e4fa3ba292d4233ddb5eef5c6610f02571ab9e92501a4dccf84adcdb16870d52410c50fedb0edd1d7d4c68829db2a2c1db91bfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-bulgarian-doc"

RDEPENDS:${PN} += ""

inherit rpm
