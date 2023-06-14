SUMMARY = "Binary files of latex-papersize"
DESCRIPTION = "Binary files of latex-papersize"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn42296"

RPM_NAME = "texlive-latex-papersize-bin-2023.20230311.svn42296-91.1.aarch64.rpm"
RPM_HASH = "0c6c83f202122d41b998521c62f882a53494b4d87c3325f02de6c66cfd780613e22e35c027615e7d511e6d8ef79580970109d2c663513d7d1ef0fb3bf9de325d"

RPROVIDES:${PN} += "texlive-latex-papersize-bin"

RDEPENDS:${PN} += "texlive-latex-papersize"

inherit rpm
