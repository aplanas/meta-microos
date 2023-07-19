SUMMARY = "Licensing information for package lttng-modules"
DESCRIPTION = "This package provides licensing documentation for the lttng kmp packages."
LICENSE = "GPL-2.0-only & LGPL-2.1-only & MIT"

PV = "2.13.9"

RPM_NAME = "lttng-modules-2.13.9-1.9.aarch64.rpm"
RPM_HASH = "2ead60d534c059a323ea75af62cc8f4e6e3ec1ec342f8e24c3538dac3940aff649b6d4fceb721ae10aba73d9994f7b52b8730a07c9f1b4efbfb614d307cb8dfe"

RPROVIDES:${PN} += "lttng-modules"

RDEPENDS:${PN} += ""

inherit rpm
