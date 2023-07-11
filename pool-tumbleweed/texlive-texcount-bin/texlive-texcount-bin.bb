SUMMARY = "Binary files of texcount"
DESCRIPTION = "Binary files of texcount"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13013"

RPM_NAME = "texlive-texcount-bin-2023.20230311.svn13013-92.1.aarch64.rpm"
RPM_HASH = "1f9ac6d9945198e2a3fe1ea06d093fb2d7fe89568db79fd7310ba4bccdccd5bbed61ad5ab2fd0025286394cb02f6907eec65b9835a563258880c54423fbe3377"

RPROVIDES:${PN} += "texlive-texcount-bin"

RDEPENDS:${PN} += "texlive-texcount"

inherit rpm
