SUMMARY = "Additional Budgie Desktop enhancements for user experience"
DESCRIPTION = "Additional Budgie Desktop enhancements for the user experience"
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-extras-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "f453db6606ea1c2c27fac05d0124bb7de5c34bdbbef4e7871ed5d63bb7b850cdbc7f4f68565b7f0b265ef07a35be1af9396149a424c42b7c568bfa495a8ac105"

RPROVIDES:${PN} += "budgie-extras"

RDEPENDS:${PN} += ""

inherit rpm
