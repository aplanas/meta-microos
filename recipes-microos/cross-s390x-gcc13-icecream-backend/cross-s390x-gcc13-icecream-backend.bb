SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-s390x-gcc13-icecream-backend-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "6e5b8df07173fafd356e2c2c1df41f6eca86bf53d229d46ee073b3959a9d8110485c91073c45fb298510e3cc8ed1dc84ac91460c5ad59f2099e3a1768ddc443f"

RPROVIDES:${PN} += "cross-s390x-gcc13-icecream-backend cross-s390x-gcc13-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
