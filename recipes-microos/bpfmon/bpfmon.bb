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

RPM_NAME = "bpfmon-2.51-1.3.aarch64.rpm"
RPM_HASH = "fe56e1ce46abd918e989f0dec6a11bdc085b989ddbaaf72ded8f3f12414218b50f0c3c8af8e365600332a5a556185f37e5dd566a0dc89ae61b84274f6489a9fc"

RPROVIDES:${PN} += "bpfmon bpfmon(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpcap.so.1()(64bit) libyascreen.so.0()(64bit) libyascreen.so.0(YASCREEN_1.79)(64bit) libyascreen.so.0(YASCREEN_1.93)(64bit)"

inherit rpm
