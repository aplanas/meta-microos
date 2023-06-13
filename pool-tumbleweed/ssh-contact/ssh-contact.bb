SUMMARY = "Tool to connect to telepathy IM contacts via SSH"
DESCRIPTION = "SSH-Contact is a client/service tool that makes it easy to connect to \
your telepathy IM contacts via SSH. No need to care about dynamic IP, \
NAT, port forwarding, or firewalls anymore; if you can chat with a \
friend, you can also SSH to their machine."
LICENSE = "GPL-2.0+"

PV = "0.7"

RPM_NAME = "ssh-contact-0.7-9.29.aarch64.rpm"
RPM_HASH = "19ac18abbcc12f942aab3fcc6c5b3b840d30a8f1c42a55b16bea1f7ccabe6ae77e6fcfadadb863bfbe99ece1fae0016a82228dbd460b27e4dfb880b5f9333266"

RPROVIDES:${PN} += "ssh-contact \
ssh-contact(aarch-64)"

RDEPENDS:${PN} += "ssh-contact-client \
ssh-contact-service"

inherit rpm
