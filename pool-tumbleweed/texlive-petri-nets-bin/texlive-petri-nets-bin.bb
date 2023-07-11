SUMMARY = "Binary files of petri-nets"
DESCRIPTION = "Binary files of petri-nets"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn39165"

RPM_NAME = "texlive-petri-nets-bin-2023.20230311.svn39165-92.1.aarch64.rpm"
RPM_HASH = "5cb5c83344eab0babb6266a1d57deb5d87541c749665e2084d33ca62ef6351c2ce4585c0e312b784116093663084fa575ee0f1dcef9c8b48ef5703a47a5e49c7"

RPROVIDES:${PN} += "texlive-petri-nets-bin"

RDEPENDS:${PN} += "texlive-petri-nets"

inherit rpm
