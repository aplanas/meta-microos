SUMMARY = "Utilities for the SAS Management Protocol (SMP)"
DESCRIPTION = "The smp_utils package contains utilities for the Serial Attached SCSI \
(SAS) Management Protocol (SMP).  Most utilities correspond to a single \
SMP function, sending out a request, checking for errors and if all is \
well processing the response. The response is either decoded, printed \
out in ASCII hexadecimal or sent as binary to stdout."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.99"

RPM_NAME = "smp_utils-0.99-2.10.aarch64.rpm"
RPM_HASH = "b2801c665e2d8cec8b249b16ab802a311936ecf9b765cdf3c5b37320fe47c34156540a588372850c1545dcb7a669b11952f0200f081392bd97799fc642fa6f1b"

RPROVIDES:${PN} += "scsi-/usr/bin/smp-conf-general \
scsi-/usr/bin/smp-conf-route-info \
scsi-/usr/bin/smp-discover \
scsi-/usr/bin/smp-discover-list \
scsi-/usr/bin/smp-phy-control \
scsi-/usr/bin/smp-phy-test \
scsi-/usr/bin/smp-read-gpio \
scsi-/usr/bin/smp-rep-exp-route-tbl \
scsi-/usr/bin/smp-rep-general \
scsi-/usr/bin/smp-rep-manufacturer \
scsi-/usr/bin/smp-rep-phy-err-log \
scsi-/usr/bin/smp-rep-phy-sata \
scsi-/usr/bin/smp-rep-route-info \
scsi-/usr/bin/smp-write-gpio \
smp-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsmputils1.so.1"

inherit rpm
