SUMMARY = "Binary files of pfarrei"
DESCRIPTION = "Binary files of pfarrei"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29348"

RPM_NAME = "texlive-pfarrei-bin-2023.20230311.svn29348-93.1.aarch64.rpm"
RPM_HASH = "d9864ac6bd4a22d244759f9ef5fc38004d6e4f319526c9e3de494eae8e918671b43a065526e329dff09eac204434ab257792a55d8a091a27e3e5e7ad78399f0f"

RPROVIDES:${PN} += "texlive-pfarrei-bin"

RDEPENDS:${PN} += "texlive-pfarrei"

inherit rpm
