SUMMARY = "Binary files of texlogfilter"
DESCRIPTION = "Binary files of texlogfilter"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn61780"

RPM_NAME = "texlive-texlogfilter-bin-2023.20230311.svn61780-91.1.aarch64.rpm"
RPM_HASH = "2571b843b9f5db93affdf1dffbeb08d736396beb452ae6e5086a2793213494381d84446eca125e86a8080b0ebc2ddc932bea2d30fa191d42d2ce14d7e24404ff"

RPROVIDES:${PN} += "texlive-texlogfilter-bin"

RDEPENDS:${PN} += "texlive-texlogfilter"

inherit rpm
