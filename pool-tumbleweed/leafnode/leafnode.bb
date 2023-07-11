SUMMARY = "Leaf site NNTP server"
DESCRIPTION = "Leafnode is a small NNTP server for leaf sites without permanent \
connection to the internet. It supports a subset of NNTP and is able to \
automatically fetch the newsgroups the user reads regularly from the \
newsserver of the ISP and additionally offer local (site-specific) \
groups to a LAN."
LICENSE = "MIT"

PV = "2.0.0+git.1677927696.44d2783"

RPM_NAME = "leafnode-2.0.0+git.1677927696.44d2783-3.4.aarch64.rpm"
RPM_HASH = "eba562c695eefe74959f7ea609405125b98ddcba84a6af4bf85ebe5d302b53aacc04f4fc5a2f848760d22e70aee0b84a7c25b4ec59e38d0cfb40aeacea4c8bc6"

RPROVIDES:${PN} += "config-leafnode \
leafnode"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libpam.so.0 \
libpcre.so.1 \
permissions \
shadow \
systemd"

inherit rpm
