SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-sparc64-gcc13-icecream-backend-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "c4863ad9b9b1262e0c41bee4628fb19b96d4a2bdd36e52f8ef92d0af9de8814860ed360942fe303c7d270426fabdb259e2447cc44f9a37b4706c9e4989719cfd"

RPROVIDES:${PN} += "cross-sparc64-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
