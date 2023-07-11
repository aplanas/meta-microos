SUMMARY = "Binary files of urlbst"
DESCRIPTION = "Binary files of urlbst"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23262"

RPM_NAME = "texlive-urlbst-bin-2023.20230311.svn23262-92.1.aarch64.rpm"
RPM_HASH = "2ee978009858e05f70a16418bf6ba5305c3c455aaaaee3ebf0d70ca2ed4953a4e40d07282c7c7e09a374c03d23a9cc3d3932a12d714a73362ddc91571459960e"

RPROVIDES:${PN} += "texlive-urlbst-bin"

RDEPENDS:${PN} += "texlive-urlbst"

inherit rpm
