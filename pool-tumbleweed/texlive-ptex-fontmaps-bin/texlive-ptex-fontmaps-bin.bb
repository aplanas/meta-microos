SUMMARY = "Binary files of ptex-fontmaps"
DESCRIPTION = "Binary files of ptex-fontmaps"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn44206"

RPM_NAME = "texlive-ptex-fontmaps-bin-2023.20230311.svn44206-93.2.aarch64.rpm"
RPM_HASH = "5841e191f098e92aa2f9087b4cc1f3269c63805d21001695e21b7f108ac39bfab38d8fb7f375739af75ec9b79dcf9f1f0ebaba708cce5315ab5339bcf71a5a51"

RPROVIDES:${PN} += "texlive-ptex-fontmaps-bin"

RDEPENDS:${PN} += "texlive-ptex-fontmaps"

inherit rpm
