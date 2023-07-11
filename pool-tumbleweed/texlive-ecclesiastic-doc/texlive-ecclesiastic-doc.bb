SUMMARY = "Documentation for texlive-ecclesiastic"
DESCRIPTION = "This package includes the documentation for texlive-ecclesiastic"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn38172"

RPM_NAME = "texlive-ecclesiastic-doc-2023.201.0.0.3svn38172-53.2.noarch.rpm"
RPM_HASH = "d56ed761fe4435893f5731761cb75ef55236c434127ff4e831a043acb9611349d9f9853f5eddebb6680a6971a394bd30d4efa03454d2dbe4d4201446c421ec03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecclesiastic-doc"

RDEPENDS:${PN} += ""

inherit rpm
