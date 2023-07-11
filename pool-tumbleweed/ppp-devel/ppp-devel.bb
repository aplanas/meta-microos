SUMMARY = "Header Files Required for Developing Plugins for pppd"
DESCRIPTION = "The package ppp-devel contains C header files required for developing \
plugins for the pppd."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "2.4.9"

RPM_NAME = "ppp-devel-2.4.9-3.4.aarch64.rpm"
RPM_HASH = "aaf1672220a7bf3af042e3c2196e819e95a9b5f66e87d7b50cb3a37bd8b93ac5e62d424a213406e4a2749419a42bdde35143d950f74914fe5370160b463ed550"

RPROVIDES:${PN} += "ppp-devel"

RDEPENDS:${PN} += "ppp"

inherit rpm
