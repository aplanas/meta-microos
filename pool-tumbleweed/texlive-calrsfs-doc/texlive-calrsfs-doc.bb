SUMMARY = "Documentation for texlive-calrsfs"
DESCRIPTION = "This package includes the documentation for texlive-calrsfs"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn17125"

RPM_NAME = "texlive-calrsfs-doc-2023.201.svn17125-52.1.noarch.rpm"
RPM_HASH = "c9b9d6e5ce00c6a3c7f3b365168760f31ed5900145cf793d2e906d9802aaa842eded941b40e9513eecf0d74d732482519efaabb9f012614e692addde96c2a100"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calrsfs-doc"

RDEPENDS:${PN} += ""

inherit rpm
