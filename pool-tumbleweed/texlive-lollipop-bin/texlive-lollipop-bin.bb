SUMMARY = "Binary files of lollipop"
DESCRIPTION = "Binary files of lollipop"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn41465"

RPM_NAME = "texlive-lollipop-bin-2023.20230311.svn41465-93.1.aarch64.rpm"
RPM_HASH = "fa7ce079907ba0a6f84bb3a34ae710b7c97c21738a056ecf5fae20d02a399a6a9c09d154b4e534160e3cae43b35890a2ba64dbfa72eb6b0dd61a7c3b5e1ba04a"

RPROVIDES:${PN} += "texlive-lollipop-bin"

RDEPENDS:${PN} += "texlive-lollipop"

inherit rpm
