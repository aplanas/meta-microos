SUMMARY = "Development Package for Festival"
DESCRIPTION = "Files needed for developing software that uses Festival."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "festival-devel-2.5.0-8.10.aarch64.rpm"
RPM_HASH = "48fa50c5b9835e23f1c6fc0b1abb8f1dda2a2956422e0c5bb080c915f3332ce4e12403bdd77eae85ac78160ae9a969649724f0cfc57a2c468e8f2efa751021d8"

RPROVIDES:${PN} += "festival-devel"

RDEPENDS:${PN} += "festival"

inherit rpm
