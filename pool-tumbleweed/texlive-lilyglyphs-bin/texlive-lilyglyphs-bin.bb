SUMMARY = "Binary files of lilyglyphs"
DESCRIPTION = "Binary files of lilyglyphs"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn31696"

RPM_NAME = "texlive-lilyglyphs-bin-2023.20230311.svn31696-93.1.aarch64.rpm"
RPM_HASH = "24557aa9e85ec9f79ebf4e35e2923045966f5e9bb40baa7677eba3860e5738af4ff0a00d95faf8da0e4971934452ad9f051f2a1d3b67741f9c0154332ca9c00c"

RPROVIDES:${PN} += "texlive-lilyglyphs-bin"

RDEPENDS:${PN} += "texlive-lilyglyphs"

inherit rpm
