SUMMARY = "Binary files of glossaries"
DESCRIPTION = "Binary files of glossaries"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37813"

RPM_NAME = "texlive-glossaries-bin-2023.20230311.svn37813-93.1.aarch64.rpm"
RPM_HASH = "86873da35c96d6a9293342d29262c7f93e600da453d48f930be820106308b4a4fc910c4ef845a20dc7335052010cfce0da89190e456fb95f08b9b81d74e81a3f"

RPROVIDES:${PN} += "texlive-glossaries-bin"

RDEPENDS:${PN} += "texlive-glossaries"

inherit rpm
