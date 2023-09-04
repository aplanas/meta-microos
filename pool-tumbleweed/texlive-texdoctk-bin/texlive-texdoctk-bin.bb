SUMMARY = "Binary files of texdoctk"
DESCRIPTION = "Binary files of texdoctk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29741"

RPM_NAME = "texlive-texdoctk-bin-2023.20230311.svn29741-93.2.aarch64.rpm"
RPM_HASH = "4231bf02cfdf03ce4f65b22e5a7f4a18327cccd55bd0ca28ca6dde268a9c7bc469d6c83a15248278905ec3fec91f2f4ef4fb7a2fdaa156f23ed72c5683f610d2"

RPROVIDES:${PN} += "texlive-texdoctk-bin"

RDEPENDS:${PN} += "texlive-texdoctk"

inherit rpm
