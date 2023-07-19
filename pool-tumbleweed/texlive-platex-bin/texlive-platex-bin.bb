SUMMARY = "Binary files of platex"
DESCRIPTION = "Binary files of platex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66079"

RPM_NAME = "texlive-platex-bin-2023.20230311.svn66079-93.1.aarch64.rpm"
RPM_HASH = "6d80b68cbf071d191f3a50649f944ba59953a541cf76ae4c3af1126dcc49eebe5f32bbf4cb08ed07f01bf85466e249c4acee43b60d856030f791f2b2dc2874ec"

RPROVIDES:${PN} += "texlive-platex-bin"

RDEPENDS:${PN} += "texlive-platex"

inherit rpm
