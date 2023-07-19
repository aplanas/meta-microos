SUMMARY = "Binary files of ctanupload"
DESCRIPTION = "Binary files of ctanupload"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23866"

RPM_NAME = "texlive-ctanupload-bin-2023.20230311.svn23866-93.1.aarch64.rpm"
RPM_HASH = "0dedf368754e6af186f60e70defa25cc31f80e54d0871a9e42b582db6d0febe45b81422ba9383dc5ddcd31f9d2030e910261a4e3e236df925fbe4889237b3014"

RPROVIDES:${PN} += "texlive-ctanupload-bin"

RDEPENDS:${PN} += "texlive-ctanupload"

inherit rpm
