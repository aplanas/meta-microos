SUMMARY = "KDE PIM Libraries: Identity Management"
DESCRIPTION = "This package provides a library to handle multiple email identities and \
associated settings."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kidentitymanagement-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "ad13beda7710e520b10b34cfd55da73cd67af4d62247f6695e76e77508e519eaeae23e56bddaa1683ff24774baf29f0e3f8c37302e94b716f2ba6fc7f918eafe"

RPROVIDES:${PN} += "kidentitymanagement"

RDEPENDS:${PN} += ""

inherit rpm
