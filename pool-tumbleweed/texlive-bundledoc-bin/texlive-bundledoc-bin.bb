SUMMARY = "Binary files of bundledoc"
DESCRIPTION = "Binary files of bundledoc"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn17794"

RPM_NAME = "texlive-bundledoc-bin-2023.20230311.svn17794-91.1.aarch64.rpm"
RPM_HASH = "2188d3e6bf58972dbe68caa8db563dfc2ac93c8fac35685825af0dbda1d68c8fa64f319b4dc446a06ae97f8d8b7c47f7866c07b2a53f4cd0ba185f0acfecef85"

RPROVIDES:${PN} += "texlive-bundledoc-bin \
texlive-bundledoc-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-bundledoc"

inherit rpm
