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

RPM_NAME = "scsirastools-1.6.6-1.3.aarch64.rpm"
RPM_HASH = "52d0066abf50c291219927c591735dd4f70a51ab1af4aeb5176403e3b7f590d40b7aa4214a451cef4dd57600fea2a1b33032549c1feeccb99506bf9f818e2125"

RPROVIDES:${PN} += "config(scsirastools) \
scsirastools \
scsirastools(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
mdadm"

inherit rpm
