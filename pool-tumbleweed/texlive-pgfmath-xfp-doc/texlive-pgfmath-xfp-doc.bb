SUMMARY = "Documentation for texlive-pgfmath-xfp"
DESCRIPTION = "This package includes the documentation for texlive-pgfmath-xfp"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn59268"

RPM_NAME = "texlive-pgfmath-xfp-doc-2023.209.1.0svn59268-52.1.noarch.rpm"
RPM_HASH = "1706a5e4c91e1fd1a4cfc0718f125f70920e4fb2c333d121d129b22be5e7a9b650ef03814a40bdf54931f1b0d8f821ce9be18b34c041f184ddc028d80c09f7f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfmath-xfp-doc"

RDEPENDS:${PN} += ""

inherit rpm
