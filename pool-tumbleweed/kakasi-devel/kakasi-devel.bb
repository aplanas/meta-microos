SUMMARY = "Header file and libraries of KAKASI"
DESCRIPTION = "header file and libraries of KAKASI"
LICENSE = "GPL-2.0+"

PV = "2.3.6"

RPM_NAME = "kakasi-devel-2.3.6-3.32.aarch64.rpm"
RPM_HASH = "206ff27c36cbc29df95b2b8149665332450fe13f38729d2305bf4dea0942a3ec470b7ce9aab21ec006634372518428651b5cdac67364bf472738860ea6448944"

RPROVIDES:${PN} += "kakasi-devel \
kakasi-devel(aarch-64) \
kakaside"
RDEPENDS:${PN} += "kakasi"

inherit rpm
