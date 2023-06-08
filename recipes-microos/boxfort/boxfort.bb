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

RPM_NAME = "boxfort-0.1.4-1.3.aarch64.rpm"
RPM_HASH = "0fbda805987a71e34675fe3527c0ebe1d45ec34ea9fe44df68158410e1bd3d97926ab0ad20fb6dabcf6537eaa48034a4519694186a8d73a56b75ce02cebb0553"

RPROVIDES:${PN} += "boxfort boxfort(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
