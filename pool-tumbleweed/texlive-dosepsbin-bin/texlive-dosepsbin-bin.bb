SUMMARY = "Binary files of dosepsbin"
DESCRIPTION = "Binary files of dosepsbin"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn24759"

RPM_NAME = "texlive-dosepsbin-bin-2023.20230311.svn24759-91.1.aarch64.rpm"
RPM_HASH = "1a23b2045317a3907a21a380d010300df3fd464e94f337c658dc3bc3fd5ea1205ad1eb9124e764691b41ed6090ec67b89b2de315df7cd132a71fe32e254518a9"

RPROVIDES:${PN} += "texlive-dosepsbin-bin \
texlive-dosepsbin-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-dosepsbin"

inherit rpm
