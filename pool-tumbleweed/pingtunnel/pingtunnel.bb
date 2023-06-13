SUMMARY = "Reliably tunnel TCP connections over ICMP packets"
DESCRIPTION = "Ping Tunnel is a tool for reliably tunneling TCP connections over ICMP echo \
request and reply packets (commonly known as ping requests and replies). It \
is useful for evading firewalls that, for whatever reason, prevent outgoing \
TCP connections, but allow in- and outgoing ICMP packets. The tunnel works \
by having a proxy run on a machine ping-able from the inside of the \
firewall, with the client running on the local machine from which TCP access \
is required. \
 \
The following example illustrates the main motivation in creating ptunnel: \
 \
Setting: You're on the go, and stumble across an open wireless network. \
The network gives you an IP address, but won't let you send TCP or UDP \
packets out to the rest of the internet, for instance to check your mail. \
What to do? By chance, you discover that the network will allow you to ping \
any computer on the rest of the internet. With ptunnel, you can utilize \
this feature to check your mail, or do other things that require TCP."
LICENSE = "BSD-3-Clause"

PV = "0.72"

RPM_NAME = "pingtunnel-0.72-1.27.aarch64.rpm"
RPM_HASH = "5c3fd4a2508268e53039fb5db50960599da216efab0e0708f5babec097a66f157f38ba9e28081ed6dfb35b475abe7fb1aa64bbfc8b1d7121558844407c64a926"

RPROVIDES:${PN} += "pingtunnel \
pingtunnel(aarch-64) \
ptunnel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpcap.so.1()(64bit)"

inherit rpm
