SUMMARY = "Binary files of tpic2pdftex"
DESCRIPTION = "Binary files of tpic2pdftex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn50281"

RPM_NAME = "texlive-tpic2pdftex-bin-2023.20230311.svn50281-92.1.aarch64.rpm"
RPM_HASH = "371ec5bee6e3ca5075708951779a0d863b490d829cb61d0024fc70cf32531fabf4f894026bf4918e23a8f8e23ddf62159e85bd90646210ef2e6d05a65077df6f"

RPROVIDES:${PN} += "texlive-tpic2pdftex-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
texlive-tpic2pdftex"

inherit rpm
