SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-ppc64-gcc12-icecream-backend-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "0320daed25f967a9bed50ff3317bf461fdb78df177452acbe2c54325eace7ec2c43eb670faff64c1ee54e3f8bdaf9a43938b1fd37042ae35a946598604542924"

RPROVIDES:${PN} += "cross-ppc64-gcc12-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
