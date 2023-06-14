SUMMARY = "Match and target extension plugins for iptables"
DESCRIPTION = "Match and Target Extension plugins for iptables."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.9"

RPM_NAME = "xtables-plugins-1.8.9-1.3.aarch64.rpm"
RPM_HASH = "2538c1faa4bf32da3d56e6b53a1dc712158e0ac41a1b1ea3f15b7ab3915e00d46ab1f8e1f6aa6efbd73d08524b578d05faa7d812bde01d416379b866ff4dc1a2"

RPROVIDES:${PN} += "libarpt-mangle.so \
libebt-802-3.so \
libebt-among.so \
libebt-arp.so \
libebt-arpreply.so \
libebt-dnat.so \
libebt-ip.so \
libebt-ip6.so \
libebt-log.so \
libebt-mark-m.so \
libebt-mark.so \
libebt-nflog.so \
libebt-pkttype.so \
libebt-redirect.so \
libebt-snat.so \
libebt-stp.so \
libebt-vlan.so \
libip6t-DNPT.so \
libip6t-HL.so \
libip6t-NETMAP.so \
libip6t-REJECT.so \
libip6t-SNPT.so \
libip6t-ah.so \
libip6t-dst.so \
libip6t-eui64.so \
libip6t-frag.so \
libip6t-hbh.so \
libip6t-hl.so \
libip6t-icmp6.so \
libip6t-ipv6header.so \
libip6t-mh.so \
libip6t-rt.so \
libip6t-srh.so \
libipt-CLUSTERIP.so \
libipt-ECN.so \
libipt-NETMAP.so \
libipt-REJECT.so \
libipt-TTL.so \
libipt-ULOG.so \
libipt-ah.so \
libipt-icmp.so \
libipt-realm.so \
libipt-ttl.so \
libxt-AUDIT.so \
libxt-CHECKSUM.so \
libxt-CLASSIFY.so \
libxt-CONNMARK.so \
libxt-CONNSECMARK.so \
libxt-CT.so \
libxt-DSCP.so \
libxt-HMARK.so \
libxt-IDLETIMER.so \
libxt-LED.so \
libxt-LOG.so \
libxt-MARK.so \
libxt-NAT.so \
libxt-NFLOG.so \
libxt-NFQUEUE.so \
libxt-RATEEST.so \
libxt-SECMARK.so \
libxt-SET.so \
libxt-SYNPROXY.so \
libxt-TCPMSS.so \
libxt-TCPOPTSTRIP.so \
libxt-TEE.so \
libxt-TOS.so \
libxt-TPROXY.so \
libxt-TRACE.so \
libxt-addrtype.so \
libxt-bpf.so \
libxt-cgroup.so \
libxt-cluster.so \
libxt-comment.so \
libxt-connbytes.so \
libxt-connlabel.so \
libxt-connlimit.so \
libxt-connmark.so \
libxt-conntrack.so \
libxt-cpu.so \
libxt-dccp.so \
libxt-devgroup.so \
libxt-dscp.so \
libxt-ecn.so \
libxt-esp.so \
libxt-hashlimit.so \
libxt-helper.so \
libxt-ipcomp.so \
libxt-iprange.so \
libxt-ipvs.so \
libxt-length.so \
libxt-limit.so \
libxt-mac.so \
libxt-mark.so \
libxt-multiport.so \
libxt-nfacct.so \
libxt-osf.so \
libxt-owner.so \
libxt-physdev.so \
libxt-pkttype.so \
libxt-policy.so \
libxt-quota.so \
libxt-rateest.so \
libxt-recent.so \
libxt-rpfilter.so \
libxt-sctp.so \
libxt-set.so \
libxt-socket.so \
libxt-standard.so \
libxt-statistic.so \
libxt-string.so \
libxt-tcp.so \
libxt-tcpmss.so \
libxt-time.so \
libxt-tos.so \
libxt-u32.so \
libxt-udp.so \
xtables-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libnetfilter-conntrack.so.3 \
libnfnetlink.so.0 \
libxtables.so.12"

inherit rpm
