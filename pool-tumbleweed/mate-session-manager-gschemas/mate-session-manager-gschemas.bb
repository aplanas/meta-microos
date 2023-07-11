SUMMARY = "MATE Session Manager GSchemas"
DESCRIPTION = "This package provides the GSettings schemas for \
MATE Session Manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-session-manager-gschemas-1.26.1-2.1.aarch64.rpm"
RPM_HASH = "f9a4b720c304590d204a7f8aacadfdf40940143c5bd56a9732fb6d793871c23269e62f6f09814465e8cf416d8465af6951978925bbd8abdfdc62b0b6ce0e2669"

RPROVIDES:${PN} += "mate-session-manager-gschemas"

RDEPENDS:${PN} += ""

inherit rpm
