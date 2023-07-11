SUMMARY = "Binary files of texloganalyser"
DESCRIPTION = "Binary files of texloganalyser"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-texloganalyser-bin-2023.20230311.svn13663-92.1.aarch64.rpm"
RPM_HASH = "1b5ce22221b3f4fc3855972ffe437f23b51543eb48acc0eda0405c5f4e930e87c7f1351f057f38ffbbda5fcb6bad561828598b754d91179cba16481e2c65a35d"

RPROVIDES:${PN} += "texlive-texloganalyser-bin"

RDEPENDS:${PN} += "texlive-texloganalyser"

inherit rpm
