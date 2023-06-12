SUMMARY = "Avocado Test Framework Example Tests"
DESCRIPTION = "The set of example tests present in the upstream tree of the Avocado framework. \
Some of them are used as functional tests of the framework, others serve as \
examples of how to write tests on your own."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "avocado-examples-69.0-6.10.noarch.rpm"
RPM_HASH = "7711c41996c1a55ddd2d622ac59ab03fc52568883632ccd04b8dd28d3ccf487f16f4d7b79ff4426e78308fe49040ff044348aef5aca4a0ca3d6d1aa747d664ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avocado-examples"
RDEPENDS:${PN} += "avocado"

inherit rpm
