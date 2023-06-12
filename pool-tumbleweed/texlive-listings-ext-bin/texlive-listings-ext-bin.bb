SUMMARY = "Binary files of listings-ext"
DESCRIPTION = "Binary files of listings-ext"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn15093"

RPM_NAME = "texlive-listings-ext-bin-2023.20230311.svn15093-91.1.aarch64.rpm"
RPM_HASH = "55b63783b4e654ab5ec2f77d896297e360d827b3376ea06f3834e8508e5b4bb272615bc037d82f831882df51bd99304a2e27aaa41d9deb2234409756c796c81a"

RPROVIDES:${PN} += "texlive-listings-ext-bin \
texlive-listings-ext-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-listings-ext"

inherit rpm
