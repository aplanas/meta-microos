SUMMARY = "A binary reaping children"
DESCRIPTION = "This executable can be used as a minimal init process inside a container."
LICENSE = "Apache-2.0"

PV = "0.9"

RPM_NAME = "kubic-pause-0.9-1.18.aarch64.rpm"
RPM_HASH = "9b0bfc5dc088af6b98dc58cc8307cf09280b3c4e8066c01c4d1c54cbaf9890d558493060da63a8c4a6f2284b964039905c8fe661b3a624dd2e435311d9701dc3"

RPROVIDES:${PN} += "kubic-pause"

RDEPENDS:${PN} += ""

inherit rpm
