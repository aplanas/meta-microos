SUMMARY = "Binary files of platex"
DESCRIPTION = "Binary files of platex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66079"

RPM_NAME = "texlive-platex-bin-2023.20230311.svn66079-93.2.aarch64.rpm"
RPM_HASH = "f1afd070e12963294ee2488908823cb9c767d4584804f081c64bc79760ecf9d0eaf9c1a3b269b193789277481c4bb36afea941d6e40e0b1ecc978f26faee52d9"

RPROVIDES:${PN} += "texlive-platex-bin"

RDEPENDS:${PN} += "texlive-platex"

inherit rpm
