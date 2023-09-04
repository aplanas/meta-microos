SUMMARY = "Binary files of authorindex"
DESCRIPTION = "Binary files of authorindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn18790"

RPM_NAME = "texlive-authorindex-bin-2023.20230311.svn18790-93.2.aarch64.rpm"
RPM_HASH = "5a9138f9004b36624ace4b8fc3c1fe8381dc2ab4ae68a05685b04defd9c1d00f0afff314e28d1f6df0dc4ad7cdce53407f0787e746ce82367c27dfb363a76fa7"

RPROVIDES:${PN} += "texlive-authorindex-bin"

RDEPENDS:${PN} += "texlive-authorindex"

inherit rpm
