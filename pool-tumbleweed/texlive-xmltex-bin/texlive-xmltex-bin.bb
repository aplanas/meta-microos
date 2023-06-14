SUMMARY = "Binary files of xmltex"
DESCRIPTION = "Binary files of xmltex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-xmltex-bin-2023.20230311.svn3006-91.1.aarch64.rpm"
RPM_HASH = "032dac0a0628c35d700a2b5c14ffac540a1c830bdf95b3483bc9c37565961d979343ec9d3c698ec2cbfee3394fca8b699557a12f098384d5f2216acf2ec205a2"

RPROVIDES:${PN} += "texlive-xmltex-bin"

RDEPENDS:${PN} += "texlive-xmltex"

inherit rpm
