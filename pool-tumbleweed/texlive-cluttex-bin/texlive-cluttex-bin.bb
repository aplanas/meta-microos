SUMMARY = "Binary files of cluttex"
DESCRIPTION = "Binary files of cluttex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn48871"

RPM_NAME = "texlive-cluttex-bin-2023.20230311.svn48871-93.1.aarch64.rpm"
RPM_HASH = "b96615df5f8869769462211473b0a291fc61c8e89b8453485c6d26648eac89d53e1d6ca26222039904ade07166bc5a4072ea3a988002505f7e050ae48dd930ce"

RPROVIDES:${PN} += "texlive-cluttex-bin"

RDEPENDS:${PN} += "texlive-cluttex"

inherit rpm
