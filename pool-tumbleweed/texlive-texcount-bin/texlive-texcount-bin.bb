SUMMARY = "Binary files of texcount"
DESCRIPTION = "Binary files of texcount"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13013"

RPM_NAME = "texlive-texcount-bin-2023.20230311.svn13013-93.1.aarch64.rpm"
RPM_HASH = "5056daa56df02eee34d7061529ae3bb184356a7b14eea800cd692a6d94720d4a5bdb4699492899f33a43a628f6f751e863bb174eafc4aaf98b92d690a30a2679"

RPROVIDES:${PN} += "texlive-texcount-bin"

RDEPENDS:${PN} += "texlive-texcount"

inherit rpm
