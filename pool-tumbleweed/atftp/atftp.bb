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

RPM_NAME = "atftp-0.8.0-1.2.aarch64.rpm"
RPM_HASH = "422873b830235768adce7b20c64156cb4de415970e31cf41cb630f3b756cda1ce6df0c6fafc4dd2a18fe93b3ce321e5f586c519e7a7953083c9f57d21ddd99e7"

RPROVIDES:${PN} += "atftp \
atftp(aarch-64) \
tftp(client) \
tftp(server)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
group(tftp) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libreadline.so.8()(64bit) \
user(tftp)"

inherit rpm
