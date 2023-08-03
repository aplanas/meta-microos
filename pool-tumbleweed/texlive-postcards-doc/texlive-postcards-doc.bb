SUMMARY = "Documentation for texlive-postcards"
DESCRIPTION = "This package includes the documentation for texlive-postcards"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21641"

RPM_NAME = "texlive-postcards-doc-2023.209.svn21641-53.1.noarch.rpm"
RPM_HASH = "ef7c83df768cc4d2229da3378fd60fa495f373184f6b719cf68644235c55d4f54725431eeef9e7efae1597d1e9c7dfb89a2c1454f7dba47f7a23f75ee1d2ed86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-postcards-doc"

RDEPENDS:${PN} += ""

inherit rpm
