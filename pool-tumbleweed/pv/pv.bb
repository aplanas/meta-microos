SUMMARY = "PipeViewer - Monitor the Progress of Data through Pipes"
DESCRIPTION = "PV ('Pipe Viewer') is a tool for monitoring the progress of data through a \
pipeline. It can be inserted into any normal pipeline between two processes \
to give a visual indication of how quickly data is passing through, how long \
it has taken, how near to completion it is, and an estimate of how long it \
will be until completion."
LICENSE = "Artistic-2.0"

PV = "1.7.24"

RPM_NAME = "pv-1.7.24-1.1.aarch64.rpm"
RPM_HASH = "8b9de6e637d2c0358cb195ef5bfc9805c707716b05fcbf3bdf8f20dc5e019ce3a8a2afcd262d03662aaf985e0bc3d56143ad20c2d7734f700a201f2b4dbd2de8"

RPROVIDES:${PN} += "pv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
