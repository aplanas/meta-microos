SUMMARY = "Avocado Test Framework Example Tests"
DESCRIPTION = "The set of example tests present in the upstream tree of the Avocado framework. \
Some of them are used as functional tests of the framework, others serve as \
examples of how to write tests on your own."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "avocado-examples-69.0-6.11.noarch.rpm"
RPM_HASH = "914ebfbdd1f14e4ee8335d774bee6afb3da10ca60eff190cda5978a6534e848f0d3d55cdc2713c094374bf29a61f3cdf2f67846619685dd19641b4e15f84ac7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avocado-examples"

RDEPENDS:${PN} += "avocado"

inherit rpm
