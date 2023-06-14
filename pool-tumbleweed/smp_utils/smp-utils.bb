SUMMARY = "Utilities for the SAS Management Protocol (SMP)"
DESCRIPTION = "The smp_utils package contains utilities for the Serial Attached SCSI \
(SAS) Management Protocol (SMP).  Most utilities correspond to a single \
SMP function, sending out a request, checking for errors and if all is \
well processing the response. The response is either decoded, printed \
out in ASCII hexadecimal or sent as binary to stdout."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.99"

RPM_NAME = "smp_utils-0.99-2.9.aarch64.rpm"
RPM_HASH = "51e4b430fce36825cd903d75cedf8a4c6cbbd8f75085ec9a4a0c73a6488ec7c3c30325a7c5c0c5370c1e8647368bd4c0264272cc8e663b2493ee8f57724e0175"

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
