SUMMARY = "Firmware update EFI binaries"
DESCRIPTION = "A UEFI binary for the fwupd project for installing updates using the UpdateCapsule \
runtime service. \
 \
It was originally imported from the combined fwupd project, and is now \
maintained separately to allow fwupd userspace releases and fwupd-efi UEFI \
executable releases to follow a different cadence."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3"

RPM_NAME = "fwupd-efi-1.3-1.1.aarch64.rpm"
RPM_HASH = "e3d437c876e0351b91395ef5e9d5eba5a8f36e79a3e008a01939ea73e05d304d5610a30958520cf1a11c5a18ef91f53126f9e9f3c48ea34230f6d9dbc56ef9bc"

RPROVIDES:${PN} += "fwupd-efi \
fwupd-efi(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
shim"

inherit rpm
