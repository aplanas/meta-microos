SUMMARY = "Binary files of mkpic"
DESCRIPTION = "Binary files of mkpic"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn33688"

RPM_NAME = "texlive-mkpic-bin-2023.20230311.svn33688-93.1.aarch64.rpm"
RPM_HASH = "023c3d8655bdceafa96e149f9fcf308e823d42451a563f38a1c28b300a2674cd05b9a7f454291c2955188e8aa2cb7d0150ee7d5e0864896f7a9a500fcf1fc982"

RPROVIDES:${PN} += "texlive-mkpic-bin"

RDEPENDS:${PN} += "texlive-mkpic"

inherit rpm
