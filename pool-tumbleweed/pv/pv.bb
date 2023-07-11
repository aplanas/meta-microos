SUMMARY = "PipeViewer - Monitor the Progress of Data through Pipes"
DESCRIPTION = "PV ('Pipe Viewer') is a tool for monitoring the progress of data through a \
pipeline. It can be inserted into any normal pipeline between two processes \
to give a visual indication of how quickly data is passing through, how long \
it has taken, how near to completion it is, and an estimate of how long it \
will be until completion."
LICENSE = "Artistic-2.0"

PV = "1.6.20"

RPM_NAME = "pv-1.6.20-1.8.aarch64.rpm"
RPM_HASH = "41086f9270c38dbeb367420d25ac37bbd129c3fac9d6ab8832073f8ba8494df6dcc41002700bf0d49bed054597c3dcde98e58476d7d6b65950e8ec33d082c124"

RPROVIDES:${PN} += "pv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
