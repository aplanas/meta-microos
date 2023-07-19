SUMMARY = "Binary files of lacheck"
DESCRIPTION = "Binary files of lacheck"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-lacheck-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "778ad02e21808e5b6ed790949e507e156d5083ae27fda8b789e0409e5d58649d9833de882dc6747f2f187e78eee71d6a3b699c021f9791b3f4342079ded2322f"

RPROVIDES:${PN} += "texlive-lacheck-bin"

RDEPENDS:${PN} += "libc.so.6 \
texlive-lacheck"

inherit rpm
