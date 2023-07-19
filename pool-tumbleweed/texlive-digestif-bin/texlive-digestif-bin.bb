SUMMARY = "Binary files of digestif"
DESCRIPTION = "Binary files of digestif"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65210"

RPM_NAME = "texlive-digestif-bin-2023.20230311.svn65210-93.1.aarch64.rpm"
RPM_HASH = "08638a67fcbd88feb0cc7d812564117b14309dbb3fcc06bd430f7694fb7c4754027ab0811b3da82b52e7b5533bd2c8745b19a24e26c709192498c7824cdba81a"

RPROVIDES:${PN} += "texlive-digestif-bin"

RDEPENDS:${PN} += "texlive-digestif"

inherit rpm
