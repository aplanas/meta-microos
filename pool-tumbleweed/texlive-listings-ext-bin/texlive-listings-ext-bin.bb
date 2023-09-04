SUMMARY = "Binary files of listings-ext"
DESCRIPTION = "Binary files of listings-ext"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn15093"

RPM_NAME = "texlive-listings-ext-bin-2023.20230311.svn15093-93.2.aarch64.rpm"
RPM_HASH = "b7327d1d978929eb2014c8e8e0afc28050c3a65f7689304a2300079d3aa0a7ab2ba6e7178c3c24ab2df36f3e57b5b491ff912fc0f39451610c1b801204c20aa3"

RPROVIDES:${PN} += "texlive-listings-ext-bin"

RDEPENDS:${PN} += "texlive-listings-ext"

inherit rpm
