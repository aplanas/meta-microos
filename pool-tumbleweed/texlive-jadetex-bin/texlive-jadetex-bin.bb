SUMMARY = "Binary files of jadetex"
DESCRIPTION = "Binary files of jadetex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-jadetex-bin-2023.20230311.svn3006-92.1.aarch64.rpm"
RPM_HASH = "bec510234052d6bd9473ba411d18fc603c3c8a785f05a31c862a2810c0a140c7dc31e5c6d24a5b66580ee17e44ac744fcc20738cedca8ceed4bc444dcccc442f"

RPROVIDES:${PN} += "texlive-jadetex-bin"

RDEPENDS:${PN} += "texlive-jadetex"

inherit rpm
