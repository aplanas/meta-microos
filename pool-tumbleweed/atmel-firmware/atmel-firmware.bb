SUMMARY = "Firmware for Atmel at76c50x Wireless Network Chips"
DESCRIPTION = "The drivers for Atmel at76c50x wireless network chips in the Linux 2.6.x kernel \
and at http://at76c503a.berlios.de/ do not include the firmware and this \
firmware needs to be loaded by the host on most cards using these chips. \
 \
This package provides the firmware images that should be automatically loaded \
as needed by the hotplug system. It also provides a small loader utility that \
can be used to accomplish the same thing when hotplug is not in use."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware"

PV = "1.3"

RPM_NAME = "atmel-firmware-1.3-166.7.noarch.rpm"
RPM_HASH = "cb7ee04dc720bed6e27de40416cfc81f4f675d353706f34b022681ff00c98412a65028868a4d76fe7aa1aaee8bce5e8933794eb838c715d63cd7a6af0e08c346"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atmel-firmware \
firmware-atmel-at76c502-3com-wpa.bin \
firmware-atmel-at76c502-3com.bin \
firmware-atmel-at76c502-wpa.bin \
firmware-atmel-at76c502.bin \
firmware-atmel-at76c502d-wpa.bin \
firmware-atmel-at76c502d.bin \
firmware-atmel-at76c502e-wpa.bin \
firmware-atmel-at76c502e.bin \
firmware-atmel-at76c503-i3861.bin \
firmware-atmel-at76c503-i3863.bin \
firmware-atmel-at76c503-rfmd-0.90.2-140.bin \
firmware-atmel-at76c503-rfmd-acc.bin \
firmware-atmel-at76c503-rfmd.bin \
firmware-atmel-at76c504-2958-wpa.bin \
firmware-atmel-at76c504.bin \
firmware-atmel-at76c504a-2958-wpa.bin \
firmware-atmel-at76c504c-wpa.bin \
firmware-atmel-at76c505-rfmd.bin \
firmware-atmel-at76c505-rfmd2958.bin \
firmware-atmel-at76c505a-rfmd2958.bin \
firmware-atmel-at76c506-wpa.bin \
firmware-atmel-at76c506.bin"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
