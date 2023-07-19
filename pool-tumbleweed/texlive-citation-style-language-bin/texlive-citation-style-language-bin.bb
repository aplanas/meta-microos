SUMMARY = "Binary files of citation-style-language"
DESCRIPTION = "Binary files of citation-style-language"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn64151"

RPM_NAME = "texlive-citation-style-language-bin-2023.20230311.svn64151-93.1.aarch64.rpm"
RPM_HASH = "3bff412b82e457e15059dfc973c884a3e956e7bdbbcaee19af1c452e58c1deccb9da6177befa36c031d961a0a8bfdd4ca5368ad36aa77fb9b8645fc2959f1db1"

RPROVIDES:${PN} += "texlive-citation-style-language-bin"

RDEPENDS:${PN} += "texlive-citation-style-language"

inherit rpm
