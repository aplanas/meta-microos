SUMMARY = "Documentation for gr-iqbal"
DESCRIPTION = "Documentation for gr-iqbal module for GNU Radio."
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20210108"

RPM_NAME = "gr-iqbal-devel-doc-0.39.0git20210108-1.13.noarch.rpm"
RPM_HASH = "93978cbfabd2472838e733915170e65d302bf8abc905b7302685d04cc1623c35b24c0ffbd9e4ecd2c1cb269ac51088c5482819e050d1508c0edb732e06772ba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gr-iqbal-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
