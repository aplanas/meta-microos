SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-hppa-gcc13-icecream-backend-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "e65b61ace251bb25579c167eb443fa1dd8ad16c3ee68c265753f07e47e620f3479c3835cb68045c06c27fd58f5a2caf534e0a5a38094ba45ea2ac6921079a4e4"

RPROVIDES:${PN} += "cross-hppa-gcc13-icecream-backend \
cross-hppa-gcc13-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
