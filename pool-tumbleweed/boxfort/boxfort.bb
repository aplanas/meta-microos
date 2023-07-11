SUMMARY = "A sandboxing C library for Criterion"
DESCRIPTION = "BoxFort provides an API to run user code in isolated processes. \
 \
Although BoxFort provides some kind of security of the parent process \
against spawned sandboxes, a sandbox has by default the same system \
permissions and access than its parent, and is hence, without care, \
ill-fitted for security purposes. \
 \
The goal of this project is portable code isolation (not security). \
For complete system isolation, consider using containers."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "boxfort-0.1.4-1.4.aarch64.rpm"
RPM_HASH = "0b777f463194bfd3f3c6a7e6711acd3600221b42bb68180b13f3e4dc3ae84b01bc617d27a1a62c76dea93268370a62e9f0138db653f0fd10c3151908d98617b6"

RPROVIDES:${PN} += "boxfort"

RDEPENDS:${PN} += ""

inherit rpm
