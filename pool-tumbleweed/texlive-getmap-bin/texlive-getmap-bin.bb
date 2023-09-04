SUMMARY = "Binary files of getmap"
DESCRIPTION = "Binary files of getmap"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn34971"

RPM_NAME = "texlive-getmap-bin-2023.20230311.svn34971-93.2.aarch64.rpm"
RPM_HASH = "591e874dc44c2e49dc4b320f939234a1cd125bfdbe7db9883725f750c96804cdb5d96bb08a5e66fe6cfdfe04fb82457fadf69f8c2d4b8131589f46f514b638ca"

RPROVIDES:${PN} += "texlive-getmap-bin"

RDEPENDS:${PN} += "texlive-getmap"

inherit rpm
