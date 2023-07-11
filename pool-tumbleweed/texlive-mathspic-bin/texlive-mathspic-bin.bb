SUMMARY = "Binary files of mathspic"
DESCRIPTION = "Binary files of mathspic"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23661"

RPM_NAME = "texlive-mathspic-bin-2023.20230311.svn23661-92.1.aarch64.rpm"
RPM_HASH = "b15d374750f52062fdd86defa23acaf9dfe151aabdcdf460da959407c4ea1bbdb7303fde16e4c01d678d435e8e4f925ca8e2d1dbec5f89cd8a8a7be4a77ca986"

RPROVIDES:${PN} += "texlive-mathspic-bin"

RDEPENDS:${PN} += "texlive-mathspic"

inherit rpm
