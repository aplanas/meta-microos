SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-ppc64-gcc7-icecream-backend-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "7263967056ccd72dccaf1d1ab20ae8ad35ca346f90cd4efa095149a3f15e8582f022132f374929ae5ecdcb4aa526ca5892873a307a103cae06841a068a70c012"

RPROVIDES:${PN} += "cross-ppc64-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
