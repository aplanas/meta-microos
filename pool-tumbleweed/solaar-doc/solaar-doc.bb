SUMMARY = "Documentation for solaar"
DESCRIPTION = "Solaar will detect all devices paired with your Unifying Receiver, and \
at the very least display some basic information about them. \
 \
For some devices, extra settings (usually not available through the \
standard Linux system configuration) are supported. For a full list of \
supported devices and their features, see docs/devices.md."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.9"

RPM_NAME = "solaar-doc-1.1.9-1.2.noarch.rpm"
RPM_HASH = "6ee91eceae18101635102dadf662e56aec7d12c07b7b965dd92dd2c90184fc6785c431445099d7da29504a7b15dec4067737910ed6ee8b2dea84ef6ffdd0233a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "solaar-doc"

RDEPENDS:${PN} += ""

inherit rpm
