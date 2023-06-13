SUMMARY = "Match and target extension plugins for iptables"
DESCRIPTION = "Match and Target Extension plugins for iptables."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.9"

RPM_NAME = "xtables-plugins-1.8.9-1.3.aarch64.rpm"
RPM_HASH = "2538c1faa4bf32da3d56e6b53a1dc712158e0ac41a1b1ea3f15b7ab3915e00d46ab1f8e1f6aa6efbd73d08524b578d05faa7d812bde01d416379b866ff4dc1a2"

RPROVIDES:${PN} += "libarpt_mangle.so()(64bit) \
libebt_802_3.so()(64bit) \
libebt_among.so()(64bit) \
libebt_arp.so()(64bit) \
libebt_arpreply.so()(64bit) \
libebt_dnat.so()(64bit) \
libebt_ip.so()(64bit) \
libebt_ip6.so()(64bit) \
libebt_log.so()(64bit) \
libebt_mark.so()(64bit) \
libebt_mark_m.so()(64bit) \
libebt_nflog.so()(64bit) \
libebt_pkttype.so()(64bit) \
libebt_redirect.so()(64bit) \
libebt_snat.so()(64bit) \
libebt_stp.so()(64bit) \
libebt_vlan.so()(64bit) \
libip6t_DNPT.so()(64bit) \
libip6t_HL.so()(64bit) \
libip6t_NETMAP.so()(64bit) \
libip6t_REJECT.so()(64bit) \
libip6t_SNPT.so()(64bit) \
libip6t_ah.so()(64bit) \
libip6t_dst.so()(64bit) \
libip6t_eui64.so()(64bit) \
libip6t_frag.so()(64bit) \
libip6t_hbh.so()(64bit) \
libip6t_hl.so()(64bit) \
libip6t_icmp6.so()(64bit) \
libip6t_ipv6header.so()(64bit) \
libip6t_mh.so()(64bit) \
libip6t_rt.so()(64bit) \
libip6t_srh.so()(64bit) \
libipt_CLUSTERIP.so()(64bit) \
libipt_ECN.so()(64bit) \
libipt_NETMAP.so()(64bit) \
libipt_REJECT.so()(64bit) \
libipt_TTL.so()(64bit) \
libipt_ULOG.so()(64bit) \
libipt_ah.so()(64bit) \
libipt_icmp.so()(64bit) \
libipt_realm.so()(64bit) \
libipt_ttl.so()(64bit) \
libxt_AUDIT.so()(64bit) \
libxt_CHECKSUM.so()(64bit) \
libxt_CLASSIFY.so()(64bit) \
libxt_CONNMARK.so()(64bit) \
libxt_CONNSECMARK.so()(64bit) \
libxt_CT.so()(64bit) \
libxt_DSCP.so()(64bit) \
libxt_HMARK.so()(64bit) \
libxt_IDLETIMER.so()(64bit) \
libxt_LED.so()(64bit) \
libxt_LOG.so()(64bit) \
libxt_MARK.so()(64bit) \
libxt_NAT.so()(64bit) \
libxt_NFLOG.so()(64bit) \
libxt_NFQUEUE.so()(64bit) \
libxt_RATEEST.so()(64bit) \
libxt_SECMARK.so()(64bit) \
libxt_SET.so()(64bit) \
libxt_SYNPROXY.so()(64bit) \
libxt_TCPMSS.so()(64bit) \
libxt_TCPOPTSTRIP.so()(64bit) \
libxt_TEE.so()(64bit) \
libxt_TOS.so()(64bit) \
libxt_TPROXY.so()(64bit) \
libxt_TRACE.so()(64bit) \
libxt_addrtype.so()(64bit) \
libxt_bpf.so()(64bit) \
libxt_cgroup.so()(64bit) \
libxt_cluster.so()(64bit) \
libxt_comment.so()(64bit) \
libxt_connbytes.so()(64bit) \
libxt_connlabel.so()(64bit) \
libxt_connlimit.so()(64bit) \
libxt_connmark.so()(64bit) \
libxt_conntrack.so()(64bit) \
libxt_cpu.so()(64bit) \
libxt_dccp.so()(64bit) \
libxt_devgroup.so()(64bit) \
libxt_dscp.so()(64bit) \
libxt_ecn.so()(64bit) \
libxt_esp.so()(64bit) \
libxt_hashlimit.so()(64bit) \
libxt_helper.so()(64bit) \
libxt_ipcomp.so()(64bit) \
libxt_iprange.so()(64bit) \
libxt_ipvs.so()(64bit) \
libxt_length.so()(64bit) \
libxt_limit.so()(64bit) \
libxt_mac.so()(64bit) \
libxt_mark.so()(64bit) \
libxt_multiport.so()(64bit) \
libxt_nfacct.so()(64bit) \
libxt_osf.so()(64bit) \
libxt_owner.so()(64bit) \
libxt_physdev.so()(64bit) \
libxt_pkttype.so()(64bit) \
libxt_policy.so()(64bit) \
libxt_quota.so()(64bit) \
libxt_rateest.so()(64bit) \
libxt_recent.so()(64bit) \
libxt_rpfilter.so()(64bit) \
libxt_sctp.so()(64bit) \
libxt_set.so()(64bit) \
libxt_socket.so()(64bit) \
libxt_standard.so()(64bit) \
libxt_statistic.so()(64bit) \
libxt_string.so()(64bit) \
libxt_tcp.so()(64bit) \
libxt_tcpmss.so()(64bit) \
libxt_time.so()(64bit) \
libxt_tos.so()(64bit) \
libxt_u32.so()(64bit) \
libxt_udp.so()(64bit) \
xtables-plugins \
xtables-plugins(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libnetfilter_conntrack.so.3()(64bit) \
libnfnetlink.so.0()(64bit) \
libxtables.so.12()(64bit)"

inherit rpm
