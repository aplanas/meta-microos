SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-sparcv9-gcc7-icecream-backend-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "96a6b4f25ec51ed6cb1930cf2db4ba2e95400b45aca6f2bbabb0fb32c40a751dbec320032851069baa002b129b20bda55e4ecbb6d3184da0dadb791b5efab9f6"

RPROVIDES:${PN} += "cross-sparcv9-gcc7-icecream-backend cross-sparcv9-gcc7-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
