SUMMARY = "Binary files of lilyglyphs"
DESCRIPTION = "Binary files of lilyglyphs"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn31696"

RPM_NAME = "texlive-lilyglyphs-bin-2023.20230311.svn31696-93.2.aarch64.rpm"
RPM_HASH = "11eae5e0144620dd44f342898e835937f14f3fcadec5e643e0085b96ed2406584762a4fa36f63bcc2b6bbc1b30a74cf5535223d74efd1b658134de60fc14d729"

RPROVIDES:${PN} += "texlive-lilyglyphs-bin"

RDEPENDS:${PN} += "texlive-lilyglyphs"

inherit rpm
