SUMMARY = "Shared code used by several utilities written by Jody Bruchon"
DESCRIPTION = "libjodycode is a software code library containing code shared among several of the programs written by Jody Bruchon such as imagepile, jdupes, winregfs, and zeromerge. These shared pieces of code were copied between each program as they were updated. As the number of programs increased and keeping these pieces of code synced became more annoying, the decision was made to combine all of them into a single reusable shared library."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "libjodycode3-3.1-1.1.aarch64.rpm"
RPM_HASH = "5b986979868c8b3f19839116a52560b789401ed6730b04d19ac9791c35e77e6d7fde95ba7a465927f4a3faf6467e1f0b6a4db6ff56005247e9788d1ebb46d7a7"

RPROVIDES:${PN} += "libjodycode.so.3 \
libjodycode3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
