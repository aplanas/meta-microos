SUMMARY = "A binary reaping children"
DESCRIPTION = "This executable can be used as a minimal init process inside a container."
LICENSE = "Apache-2.0"

PV = "0.9"

RPM_NAME = "kubic-pause-0.9-1.19.aarch64.rpm"
RPM_HASH = "c16402acfbaafe75fd37202f5b59c6f37ac2b53b05ead578ba90d0eb149f7020baf7a90e92964bb0350f0876e6e821504e03ebc409b2c8aaad59d904f303e00f"

RPROVIDES:${PN} += "kubic-pause"

RDEPENDS:${PN} += ""

inherit rpm
