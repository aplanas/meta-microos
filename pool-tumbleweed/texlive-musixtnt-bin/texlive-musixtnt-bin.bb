SUMMARY = "Binary files of musixtnt"
DESCRIPTION = "Binary files of musixtnt"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-musixtnt-bin-2023.20230311.svn62210-93.1.aarch64.rpm"
RPM_HASH = "ad5152e995b50ca91d8bfa27b049c39707c0863456d5b30c691c2e37539943b95c78695eb4bd6be555a8a524d653d8918b03552782bdecf8976ae4914bdd1f5f"

RPROVIDES:${PN} += "texlive-musixtnt-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-musixtnt"

inherit rpm
