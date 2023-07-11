SUMMARY = "Binary files of texplate"
DESCRIPTION = "Binary files of texplate"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53444"

RPM_NAME = "texlive-texplate-bin-2023.20230311.svn53444-92.1.aarch64.rpm"
RPM_HASH = "85eb4fc8460e17162900ecda0d789b9d0a83a6fd4e197836c6ce49cdc3b8f14b6ee6b36fe711ea4fe92a3d5465b1ed2d74af66c61078cbcef87d8cf6e1bfcc3f"

RPROVIDES:${PN} += "texlive-texplate-bin"

RDEPENDS:${PN} += "texlive-texplate"

inherit rpm
