SUMMARY = "Binary files of uplatex"
DESCRIPTION = "Binary files of uplatex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn52800"

RPM_NAME = "texlive-uplatex-bin-2023.20230311.svn52800-93.1.aarch64.rpm"
RPM_HASH = "34d141c42a5579ed513a6b80cf41463d0ebfc5628f51df652837532b9890cd12856f77dbd816c40d12127722ff3b55390f2d60ef4ad78aef4d550bb19c4691f3"

RPROVIDES:${PN} += "texlive-uplatex-bin"

RDEPENDS:${PN} += "texlive-uplatex"

inherit rpm
