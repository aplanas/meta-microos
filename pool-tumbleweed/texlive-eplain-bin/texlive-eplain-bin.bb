SUMMARY = "Binary files of eplain"
DESCRIPTION = "Binary files of eplain"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-eplain-bin-2023.20230311.svn3006-92.1.aarch64.rpm"
RPM_HASH = "6ab2c8b6788cea55080cec9147b5a07bd2eba9abdca87ea6a19744bbbc09c3b6a739489c852bf909ecdd57ce95e999de23314003ea0b4607bb63e59ca7700c8f"

RPROVIDES:${PN} += "texlive-eplain-bin"

RDEPENDS:${PN} += "texlive-eplain"

inherit rpm
