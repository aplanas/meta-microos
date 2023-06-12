SUMMARY = "Persistent classic network interface naming scheme"
DESCRIPTION = "This package, when installed, disables the default 'Predictable \
Network Interface Naming' scheme[PNIN] in udev, and switches it to a \
first-loaded-first-named, reboot-persistent scheme. \
 \
[PNIN] http://freedesktop.org/wiki/Software/systemd/PredictableNetworkInterfaceNames/ \
 \
Differences from PNIN: \
* Re-enumeration when the L2 address changes. \
* Interface names are not - and cannot be - derived from another property \
  like PCI bus address."
LICENSE = "GPL-2.0"

PV = "0.1"

RPM_NAME = "udev-persistent-ifnames-0.1-2.16.noarch.rpm"
RPM_HASH = "bc0e1cc0a724216575bf8e7e574f49a8ba5cbc61339b3f7f7fc3c703f0d7734747c522f3f9ab2f7ebaa2e31d67fbbf23923c9a3cfef388f2741b56c9f8f5c801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "udev-persistent-ifnames"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh"

inherit rpm
