SUMMARY = "Binary files of splitindex"
DESCRIPTION = "Binary files of splitindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29688"

RPM_NAME = "texlive-splitindex-bin-2023.20230311.svn29688-93.1.aarch64.rpm"
RPM_HASH = "1bc6e69b3652cb83798a3b602cb709fcdc9de746fcf06221ea5a40c408ee0a18fb3a96735a9b454a5d638499ac8f8ca8ee6aac6ad47072d731d92da7c23f76f3"

RPROVIDES:${PN} += "texlive-splitindex-bin"

RDEPENDS:${PN} += "texlive-splitindex"

inherit rpm
