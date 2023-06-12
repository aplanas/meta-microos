SUMMARY = "Unicode Emoji Data Files"
DESCRIPTION = "Unicode Emoji Data Files are the machine-readable \
emoji data files associated with \
http://www.unicode.org/reports/tr51/index.html"
LICENSE = "Unicode"

PV = "15.0"

RPM_NAME = "unicode-emoji-15.0-1.2.noarch.rpm"
RPM_HASH = "8b2c98eff031ff61d7c0a9a658ef43c342b2c5ad773e8a3ba34783235c15e286faabd4f6a16d4d7fddc93eebd8e5aa1c63854cb197d31c025777ec4276128c32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unicode-emoji"
RDEPENDS:${PN} += ""

inherit rpm
