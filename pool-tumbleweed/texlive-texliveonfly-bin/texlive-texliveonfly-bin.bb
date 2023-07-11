SUMMARY = "Binary files of texliveonfly"
DESCRIPTION = "Binary files of texliveonfly"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn24062"

RPM_NAME = "texlive-texliveonfly-bin-2023.20230311.svn24062-92.1.aarch64.rpm"
RPM_HASH = "56b54b1aeb344bcacbdfa0e04a5888fea2457433adf4ecd252151ee96bc9ec02693b04a5a2de374200ab5984766ed83b3b4d50e83330027c23a7d8edfca5fe7a"

RPROVIDES:${PN} += "texlive-texliveonfly-bin"

RDEPENDS:${PN} += "texlive-texliveonfly"

inherit rpm
