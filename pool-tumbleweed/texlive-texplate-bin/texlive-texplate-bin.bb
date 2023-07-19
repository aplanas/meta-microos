SUMMARY = "Binary files of texplate"
DESCRIPTION = "Binary files of texplate"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53444"

RPM_NAME = "texlive-texplate-bin-2023.20230311.svn53444-93.1.aarch64.rpm"
RPM_HASH = "ab710ba97b4e6c3db891977967dd7e303b42884f26060d8234e4bc810ed1d91bf8d59b41206ca2714d0cb4b72395c35f4c5a5eda9789dd1ca9af016b742ae107"

RPROVIDES:${PN} += "texlive-texplate-bin"

RDEPENDS:${PN} += "texlive-texplate"

inherit rpm
