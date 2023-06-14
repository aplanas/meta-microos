SUMMARY = "A mini webserver showing a hello kubic page"
DESCRIPTION = "hello-kubic is a mini webserver with a 'Hello Kubic' webpage \
containing some informations about the running system, container \
or pod."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "hello-kubic-1.4.1-1.6.aarch64.rpm"
RPM_HASH = "c06c53edbfbd8c4f05490e193534970bebd2b745b898d2c8d2a11522640c2ee40a3c78f97463a859201624aee89465b290a52d6bb5ac81d8156b4e2b4b8d59e0"

RPROVIDES:${PN} += "hello-kubic"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
