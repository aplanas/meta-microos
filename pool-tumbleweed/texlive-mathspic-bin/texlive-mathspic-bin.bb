SUMMARY = "Binary files of mathspic"
DESCRIPTION = "Binary files of mathspic"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23661"

RPM_NAME = "texlive-mathspic-bin-2023.20230311.svn23661-93.1.aarch64.rpm"
RPM_HASH = "dc4409407df20983581682d02ae8f0385f612aa7c476d9d3155368137bae9605bab48ba93f768b7769a02ee5bdee8e4a03a054ebe5d1e753f8491f3ba41ebffb"

RPROVIDES:${PN} += "texlive-mathspic-bin"

RDEPENDS:${PN} += "texlive-mathspic"

inherit rpm
