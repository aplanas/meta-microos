SUMMARY = "Firmware update EFI binaries"
DESCRIPTION = "A UEFI binary for the fwupd project for installing updates using the UpdateCapsule \
runtime service. \
 \
It was originally imported from the combined fwupd project, and is now \
maintained separately to allow fwupd userspace releases and fwupd-efi UEFI \
executable releases to follow a different cadence."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3"

RPM_NAME = "fwupd-efi-1.3-1.3.aarch64.rpm"
RPM_HASH = "70826fb205d38b94667f591532d083513fc7536cfd90fb8b96775a2c4024cf7bf286b7bb51f9d72031edf45aec33c51c1807ea8f22c7f36ab7f24eea840c3bcf"

RPROVIDES:${PN} += "fwupd-efi"

RDEPENDS:${PN} += "/usr/bin/sh \
shim"

inherit rpm
