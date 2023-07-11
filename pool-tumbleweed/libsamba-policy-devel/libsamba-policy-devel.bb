SUMMARY = "Development files for the Samba AD Group Policy library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libsamba-policy."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.3+git.303.c08b73d523c"

RPM_NAME = "libsamba-policy-devel-4.18.3+git.303.c08b73d523c-1.2.aarch64.rpm"
RPM_HASH = "4b631e188c55f84f43fd8f13ebebf254fe70d29225ee11164dc3521b656d3ac7d9d252b452ca88686db97e65d5bdb25c1bb7fdb3411e763f4c8c905cc592db25"

RPROVIDES:${PN} += "libsamba-policy-devel"

RDEPENDS:${PN} += "libsamba-policy-python3-devel"

inherit rpm
