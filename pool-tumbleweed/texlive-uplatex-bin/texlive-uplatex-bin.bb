SUMMARY = "Binary files of uplatex"
DESCRIPTION = "Binary files of uplatex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn52800"

RPM_NAME = "texlive-uplatex-bin-2023.20230311.svn52800-91.1.aarch64.rpm"
RPM_HASH = "9795fb03fa05c119f6474b2ce62c2e17888d6452e66c921c666cf0fe060354d021a903b1c379957c44e6f6be4ddff509a552c93b338be0412fa4ca248628a049"

RPROVIDES:${PN} += "texlive-uplatex-bin"

RDEPENDS:${PN} += "texlive-uplatex"

inherit rpm
