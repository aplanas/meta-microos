SUMMARY = "Documentation for texlive-datetime2-czech"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-czech"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47033"

RPM_NAME = "texlive-datetime2-czech-doc-2023.209.1.1svn47033-53.1.noarch.rpm"
RPM_HASH = "ad78f1291dd56a0521365d333c826ca414a90d556f133ef5be5ecf12eb7a0e9bae710837fb514a8f7e6c1d5a16bb50a576d98e7739cec387a329cbdebef3aa54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-czech-doc"

RDEPENDS:${PN} += ""

inherit rpm
