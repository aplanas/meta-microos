SUMMARY = "Binary files of rubik"
DESCRIPTION = "Binary files of rubik"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32919"

RPM_NAME = "texlive-rubik-bin-2023.20230311.svn32919-93.1.aarch64.rpm"
RPM_HASH = "bcff95afae0df2263f95353d0ece805d88baa5276f4750eb059e30dd9fcabf93af5f18a6020bd0e9c7d366cd2c5183c9fcfecaeee2c9a6f411aa2889c0d70e67"

RPROVIDES:${PN} += "texlive-rubik-bin"

RDEPENDS:${PN} += "texlive-rubik"

inherit rpm
