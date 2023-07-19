SUMMARY = "Binary files of tpic2pdftex"
DESCRIPTION = "Binary files of tpic2pdftex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn50281"

RPM_NAME = "texlive-tpic2pdftex-bin-2023.20230311.svn50281-93.1.aarch64.rpm"
RPM_HASH = "b5c6c146868a46e6fe2d48a0b465669b4d9ef0212bf67ef66736dd3057d8df92cff7c3faae1f82c75b1e8a9171914d514dd37417b9e3c0d1ea1f6cac9519ea9e"

RPROVIDES:${PN} += "texlive-tpic2pdftex-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
texlive-tpic2pdftex"

inherit rpm
