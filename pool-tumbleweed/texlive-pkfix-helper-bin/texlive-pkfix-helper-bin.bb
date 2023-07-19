SUMMARY = "Binary files of pkfix-helper"
DESCRIPTION = "Binary files of pkfix-helper"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-pkfix-helper-bin-2023.20230311.svn13663-93.1.aarch64.rpm"
RPM_HASH = "f9ebabcacfaabf9d653d37e496d6064633ee1c3dc7f7e0e915c11cfac9231cd208f281e2b0f09e40ec86e1fb7d69bc053b18b6e4eda78c2834a38f51459c6e29"

RPROVIDES:${PN} += "texlive-pkfix-helper-bin"

RDEPENDS:${PN} += "texlive-pkfix-helper"

inherit rpm
