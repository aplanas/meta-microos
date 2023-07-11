SUMMARY = "Binary files of authorindex"
DESCRIPTION = "Binary files of authorindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn18790"

RPM_NAME = "texlive-authorindex-bin-2023.20230311.svn18790-92.1.aarch64.rpm"
RPM_HASH = "0f9b85698ec42d9e8c07ec50eab68d8d44f48f4e062b8fa4ad123caa4480797f4a6a78b65d3c7c69e0115876d496d662ec367f1cbfbb2cbd610178df828560de"

RPROVIDES:${PN} += "texlive-authorindex-bin"

RDEPENDS:${PN} += "texlive-authorindex"

inherit rpm
