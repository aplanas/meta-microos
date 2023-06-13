SUMMARY = "Web Phone"
DESCRIPTION = "Devel package for linphone."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.16"

RPM_NAME = "linphone-devel-5.0.16-1.1.noarch.rpm"
RPM_HASH = "95147bb5f29f92cd4ad565773e8548be7b955900d90c304bc2727e7a892a8f8294cdd1f5e8fffab3abe9f38b39e6d1cff9d1778b5d1d90ba3c66d3b711a3632a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linphone-devel"

RDEPENDS:${PN} += ""

inherit rpm
