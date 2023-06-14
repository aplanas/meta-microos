SUMMARY = "MATE Session Manager GSchemas"
DESCRIPTION = "This package provides the GSettings schemas for \
MATE Session Manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-session-manager-gschemas-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "553b8e3fce43cb8e93736e1cd5f6e7cf80fec4cd13202618d23d0e7f083bf62f88346f85be418afffd7678b30649ededa2819aeceefff76ad5cd0381a9fe243c"

RPROVIDES:${PN} += "mate-session-manager-gschemas"

RDEPENDS:${PN} += ""

inherit rpm
