SUMMARY = "Binary files of musixtnt"
DESCRIPTION = "Binary files of musixtnt"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-musixtnt-bin-2023.20230311.svn62210-93.2.aarch64.rpm"
RPM_HASH = "118b1d1ba52157fc92ff81c9657ce3611363be290ddf68cd1d55330bfcfdeba6cfce85aebb3fcfc7d50fc4f64fe9b38a27ed81a85b57213ae7402c9cbce3e71e"

RPROVIDES:${PN} += "texlive-musixtnt-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-musixtnt"

inherit rpm
