SUMMARY = "Binary files of mltex"
DESCRIPTION = "Binary files of mltex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-mltex-bin-2023.20230311.svn3006-93.1.aarch64.rpm"
RPM_HASH = "b2df8dfcfbb28656d17c6d8a2915263f56a607dcb3b83ced18dfe1a7b0d71cb3561f061ea40d693c28fee21c9f24db08cf16f4998cc8c4a8d678cc350fd367d3"

RPROVIDES:${PN} += "texlive-mltex-bin"

RDEPENDS:${PN} += "texlive-mltex"

inherit rpm
