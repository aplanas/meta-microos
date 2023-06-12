SUMMARY = "PipeViewer - Monitor the Progress of Data through Pipes"
DESCRIPTION = "PV ('Pipe Viewer') is a tool for monitoring the progress of data through a \
pipeline. It can be inserted into any normal pipeline between two processes \
to give a visual indication of how quickly data is passing through, how long \
it has taken, how near to completion it is, and an estimate of how long it \
will be until completion."
LICENSE = "Artistic-2.0"

PV = "1.6.20"

RPM_NAME = "pv-1.6.20-1.7.aarch64.rpm"
RPM_HASH = "e94c70e0fabd50732a31ba57134d094aad0918fea240b314a71502f1fc636d680d1f36212a29a29924bfd825695389c9862c2c10306739d857bd03b23a357fec"

RPROVIDES:${PN} += "pv \
pv(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
