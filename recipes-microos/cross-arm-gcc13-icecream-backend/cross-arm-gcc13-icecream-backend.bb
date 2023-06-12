SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-arm-gcc13-icecream-backend-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "90ef4f8dd7dada6f386cdb901079995c106689c509d34e4d7cb569f119540aea731cd43ddc27d6bbe95a9b7e52392d54725ca8e154d53cca44cc227a313123cf"

RPROVIDES:${PN} += "cross-arm-gcc13-icecream-backend cross-arm-gcc13-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
