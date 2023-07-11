SUMMARY = "Binary files of pagelayout"
DESCRIPTION = "Binary files of pagelayout"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65625"

RPM_NAME = "texlive-pagelayout-bin-2023.20230311.svn65625-92.1.aarch64.rpm"
RPM_HASH = "b2f627f354957e0cb0bb3de2fffff95a38978e9202479f923a7f34ead50d19ef0b326bf811f7a392e3dc085bdeb338b5370d5af651aeaa8d11ac17638643d4a1"

RPROVIDES:${PN} += "texlive-pagelayout-bin"

RDEPENDS:${PN} += "texlive-pagelayout"

inherit rpm
