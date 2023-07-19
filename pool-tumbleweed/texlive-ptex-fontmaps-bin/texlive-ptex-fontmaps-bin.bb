SUMMARY = "Binary files of ptex-fontmaps"
DESCRIPTION = "Binary files of ptex-fontmaps"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn44206"

RPM_NAME = "texlive-ptex-fontmaps-bin-2023.20230311.svn44206-93.1.aarch64.rpm"
RPM_HASH = "96db385f106eb4f529e0a2e88acf9a45aaa2d763308c6ab0cef9363c9983a54dc53248a0faedac85786c04cd1fa81763e42f7d32c8665da3e4c9cf65d61c5941"

RPROVIDES:${PN} += "texlive-ptex-fontmaps-bin"

RDEPENDS:${PN} += "texlive-ptex-fontmaps"

inherit rpm
