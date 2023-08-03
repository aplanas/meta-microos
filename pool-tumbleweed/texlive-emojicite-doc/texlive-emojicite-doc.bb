SUMMARY = "Documentation for texlive-emojicite"
DESCRIPTION = "This package includes the documentation for texlive-emojicite"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn55131"

RPM_NAME = "texlive-emojicite-doc-2023.209.0.0.3svn55131-54.1.noarch.rpm"
RPM_HASH = "ee86da8c1e2ecb38d4e6b7e82611fb7eebb3ae75dbaa9068abb0e0cfb30406da168ba2b8a071a48a4c7565a62230e690890e4f0b7d24197f63938f7df91e8ab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emojicite-doc"

RDEPENDS:${PN} += ""

inherit rpm
