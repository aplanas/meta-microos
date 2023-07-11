SUMMARY = "Binary files of xmltex"
DESCRIPTION = "Binary files of xmltex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-xmltex-bin-2023.20230311.svn3006-92.1.aarch64.rpm"
RPM_HASH = "e915cba75fe43343a45083a4f5dccac0fa469e53db1a5931e5b2424cec0344c77a11b0118b4cecb823ec91ddfd4293177bbbaae48f044801609bf1bacdd4c61d"

RPROVIDES:${PN} += "texlive-xmltex-bin"

RDEPENDS:${PN} += "texlive-xmltex"

inherit rpm
