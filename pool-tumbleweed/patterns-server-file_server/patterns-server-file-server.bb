SUMMARY = "File Server"
DESCRIPTION = "File services to host files so that they may be accessed or retrieved by other computers on the same network. This includes the FTP, SMB, and NFS protocols."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-file_server-20210330-5.1.aarch64.rpm"
RPM_HASH = "27c03c862178ed679d0708d9770cf07ca76a03e0211d4705bec3f65c034b6587c812870c102ed8bccee201db95a9c914baa2859886ba5c733eef2cf8c555ba16"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-openSUSE-file-server \
patterns-server-file-server"

RDEPENDS:${PN} += "nfs-kernel-server \
pattern-"

inherit rpm
