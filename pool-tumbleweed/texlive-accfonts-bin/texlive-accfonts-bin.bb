SUMMARY = "Binary files of accfonts"
DESCRIPTION = "Binary files of accfonts"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn12688"

RPM_NAME = "texlive-accfonts-bin-2023.20230311.svn12688-92.1.aarch64.rpm"
RPM_HASH = "ce7257613c60d8eb8963014b115bc4493d5a479ac33d8723bf489559131628a02831c6639f54672110315464cf2609a2f21a15883de92731d713aa7235e3c8e7"

RPROVIDES:${PN} += "texlive-accfonts-bin"

RDEPENDS:${PN} += "texlive-accfonts"

inherit rpm
