SUMMARY = "Documentation for texlive-tkz-orm"
DESCRIPTION = "This package includes the documentation for texlive-tkz-orm"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1.4svn61719"

RPM_NAME = "texlive-tkz-orm-doc-2023.201.0.0.1.4svn61719-52.1.noarch.rpm"
RPM_HASH = "fdb927336d1900086097db40b3a87c6fd079fb9f15469afd217f5bfe0277f1e563a41bfeb461dac0477c5ac2ad0344be9f54db28f44024102b0bab7fcad3257e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tkz-orm-doc"

RDEPENDS:${PN} += ""

inherit rpm
