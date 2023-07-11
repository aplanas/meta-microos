SUMMARY = "Serviceability for SCSI Disks and Arrays"
DESCRIPTION = "The SCSI RAS (Reliability, Availability, and Serviceability) tools \
work with SCSI devices used in a Linux software RAID-1 configuration. \
 \
* sgraidmon - a tool to monitor software RAID disks for \
  hot-insertion/removal \
* sgdefects - a tool to read the primary and grown defect lists \
* sgdskfl - a tool to load disk firmware to SCSI disks under Linux \
* sgmode - a tool to get and set SCSI device mode pages \
* sgdiag - a tool to perform format and other diagnostic functions \
 \
The tools require SCSIRAS patches in the kernel; these are not \
present in SUSE-provided kernels."
LICENSE = "BSD-3-Clause"

PV = "1.6.6"

RPM_NAME = "scsirastools-1.6.6-1.4.aarch64.rpm"
RPM_HASH = "3a97d69d93999067f5c8c180df6ba25ec131006b2549cba360c842c18dffa1beb11f3fe0739af5d51c2eb6b3233d1400f353a2bcfb5d7e018ffcbd41fe9a7823"

RPROVIDES:${PN} += "config-scsirastools \
scsirastools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
mdadm"

inherit rpm
