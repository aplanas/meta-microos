SUMMARY = "User Space Tool to Set Up and Maintain ARP Filtering Tables"
DESCRIPTION = "arptables is a user space tool used to set up and maintain the tables \
of ARP rules in the Linux kernel. These rules inspect the ARP frames. \
arptables is similar to the iptables userspace tool, but less \
complicated."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.5"

RPM_NAME = "arptables-0.0.5-1.13.aarch64.rpm"
RPM_HASH = "3829da56ac19af261b175034872fc156b69e2915073d5c36a033ef52c2692a8a477701b42e64020d13639fa99f49b21f1d350094a42dc700b68c8ad346d381de"

RPROVIDES:${PN} += "arptables"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
