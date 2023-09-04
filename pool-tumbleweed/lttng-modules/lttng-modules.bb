SUMMARY = "Licensing information for package lttng-modules"
DESCRIPTION = "This package provides licensing documentation for the lttng kmp packages."
LICENSE = "GPL-2.0-only & LGPL-2.1-only & MIT"

PV = "2.13.9"

RPM_NAME = "lttng-modules-2.13.9-1.14.aarch64.rpm"
RPM_HASH = "0cfb61f323d743dccb4b63ecf89e9452c8cf4fb2b0745a75a0a78e615f213d98f8eee7a57dd4268d39a7e2579c07a77c77e89e42776b522668c73cc27d33045d"

RPROVIDES:${PN} += "lttng-modules"

RDEPENDS:${PN} += ""

inherit rpm
