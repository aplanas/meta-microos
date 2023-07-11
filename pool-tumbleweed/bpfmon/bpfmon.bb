SUMMARY = "Traffic monitor for BPF expression/iptables rule"
DESCRIPTION = "While tcpdump shows what packets are going through the \
network, bpfmon will show how much in terms \
of bytes per second and packets per second in a \
nice pseudo-graphical terminal interface. \
 \
bpfmon also supports monitoring an iptables rule that \
is selected by command line option or selected from a \
menu."
LICENSE = "GPL-2.0-or-later"

PV = "2.51"

RPM_NAME = "bpfmon-2.51-1.4.aarch64.rpm"
RPM_HASH = "2aea7b47eb6bd6265d05b3f114182c25fd13a35d52908bfb002ba8500d4d808e2555be369e63c91d096eace8771091f5b082275ca38130022debf92be5fdf5e2"

RPROVIDES:${PN} += "bpfmon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcap.so.1 \
libyascreen.so.0"

inherit rpm
