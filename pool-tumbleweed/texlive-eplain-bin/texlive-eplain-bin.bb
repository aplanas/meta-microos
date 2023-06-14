SUMMARY = "Binary files of eplain"
DESCRIPTION = "Binary files of eplain"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-eplain-bin-2023.20230311.svn3006-91.1.aarch64.rpm"
RPM_HASH = "9c62e7ba8dd9b9d91124b708f6ef983c9407b8f5c858cfa4941a7368a2851896976d291da34df3776c5983c1a15836636a78e11123d5abb9758782b3eb561bcc"

RPROVIDES:${PN} += "texlive-eplain-bin"

RDEPENDS:${PN} += "texlive-eplain"

inherit rpm
