SUMMARY = "Documentation and examples for python39-watchdog"
DESCRIPTION = "This package contains documentation and examples for python39-watchdog."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python39-watchdog-doc-3.0.0-2.3.noarch.rpm"
RPM_HASH = "8a1d3eec9c08336a57b7b7a5bc2d20eab7dbe1126200f748d0bdb1da5091b125808f40dfddfb4643f4fa5bd060a03c789598d7e25763fe7807784af02afdb6d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-watchdog-doc"

RDEPENDS:${PN} += ""

inherit rpm
