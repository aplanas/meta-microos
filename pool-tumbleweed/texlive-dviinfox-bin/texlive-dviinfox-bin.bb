SUMMARY = "Binary files of dviinfox"
DESCRIPTION = "Binary files of dviinfox"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn44515"

RPM_NAME = "texlive-dviinfox-bin-2023.20230311.svn44515-93.1.aarch64.rpm"
RPM_HASH = "4cf35b259b9c4797a8cf440ce25c3ddc2e6091c3d5531031f9a1dfdb0ea9dfa4ccfa4cf3704a29d6d1b8db7022f88b51d8464185a2f09ba8f9149d25315377b2"

RPROVIDES:${PN} += "texlive-dviinfox-bin"

RDEPENDS:${PN} += "texlive-dviinfox"

inherit rpm
