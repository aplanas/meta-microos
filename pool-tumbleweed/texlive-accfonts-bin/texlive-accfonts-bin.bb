SUMMARY = "Binary files of accfonts"
DESCRIPTION = "Binary files of accfonts"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn12688"

RPM_NAME = "texlive-accfonts-bin-2023.20230311.svn12688-93.2.aarch64.rpm"
RPM_HASH = "f0c95b8c03b545a3e26c17d94f4083874e8c6f966845e8115f5937ed3be1ae68b0c98b0b7deb7b9fea2cfaab0e0defb202e41bcce9fe34d3b5c6ff2ccf3a4e55"

RPROVIDES:${PN} += "texlive-accfonts-bin"

RDEPENDS:${PN} += "texlive-accfonts"

inherit rpm
