SUMMARY = "Binary files of tie"
DESCRIPTION = "Binary files of tie"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-tie-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "0d8664c253da5a64528169a0a56e9e7444bb0b28567b32ee744c4076c4782d03adffbc325083fdd5923fac7d0231959179406b5f9c4012e86b39ac5493ee44af"

RPROVIDES:${PN} += "texlive-tie-bin"

RDEPENDS:${PN} += "libc.so.6 \
libkpathsea.so.6 \
texlive-tie"

inherit rpm
