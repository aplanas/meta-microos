SUMMARY = "AMD based arm64 systems"
DESCRIPTION = "Device Tree files for AMD based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-amd-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "56d60b65ad1aa596834c5b37a2f59f06a7492187d5bb913231cdaf8409926f2a248c91f460a789581f37b3320056484baa0831d4f12abbaafe93ea1d9659883a"

RPROVIDES:${PN} += "dtb-amd dtb-amd(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
