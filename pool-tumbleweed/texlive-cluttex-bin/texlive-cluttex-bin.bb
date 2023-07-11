SUMMARY = "Binary files of cluttex"
DESCRIPTION = "Binary files of cluttex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn48871"

RPM_NAME = "texlive-cluttex-bin-2023.20230311.svn48871-92.1.aarch64.rpm"
RPM_HASH = "04722763b89ad3db799fc2bc1cb527c056f061a48da00cd7f478da0b0393eb216162df00fce2b0cf5da78a6a0bc441143457f1ae639783f11bdbb4ee36d79b98"

RPROVIDES:${PN} += "texlive-cluttex-bin"

RDEPENDS:${PN} += "texlive-cluttex"

inherit rpm
