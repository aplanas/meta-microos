SUMMARY = "CLI tools to collect and process netflow data"
DESCRIPTION = "The nfdump tools collect and process netflow data on the command line. \
They are part of the NFSEN project which is explained more detailed at \
http://www.terena.nl/tech/task-forces/tf-csirt/meeting12/nfsen-Haag.pdf"
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "nfdump-1.7.1-1.4.aarch64.rpm"
RPM_HASH = "f1400b0d4d10052eb2daf9678e8f52014456c3dd0bbd3a2bbb2d6b96d6580162fccfad38964ee579452758e3cb31e0938af04e72c76b5e9008ceb87fc408037b"

RPROVIDES:${PN} += "config-nfdump \
nfdump"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libnfdump-1.7.1.so \
librrd.so.8 \
rrdtool"

inherit rpm
