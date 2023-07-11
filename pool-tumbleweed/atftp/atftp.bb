SUMMARY = "Advanced TFTP Server and Client"
DESCRIPTION = "atftp stands for Advanced Trivial File Transfer Protocol. It is called \
'advanced', in contrast to others TFTP servers, for two reasons. First, \
it is intended to be fully compliant with all related RFCs. This \
includes RFC1350, RFC2090, RFC2347, RFC2348, and RFC2349. Second, atftp \
is intended for serving boot files to large clusters. It is \
multithreaded and will eventually support multicast, allowing faster \
boot of hundreds of machines simultaneously."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "atftp-0.8.0-1.3.aarch64.rpm"
RPM_HASH = "272a15267c1007b17397376fcc88fcc17945feda26b26822d49d819a9b8e5206710e96ca5fd04b3bff142c2938a78e015273001ac0f1bc0b961cdc42aeb29e35"

RPROVIDES:${PN} += "atftp \
tftp-client \
tftp-server"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-tftp \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
user-tftp"

inherit rpm
