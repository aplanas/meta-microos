SUMMARY = "Binary files of xindex"
DESCRIPTION = "Binary files of xindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn49312"

RPM_NAME = "texlive-xindex-bin-2023.20230311.svn49312-91.1.aarch64.rpm"
RPM_HASH = "ec29270859ac29ac3068bf142264bdd6127d475daf13044d370d40c840a82ea253018ad9bba89019a68fe1c647494266bd40ae62af30e103650aa7db6db9328b"

RPROVIDES:${PN} += "texlive-xindex-bin"

RDEPENDS:${PN} += "texlive-xindex"

inherit rpm
