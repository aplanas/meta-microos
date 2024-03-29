SUMMARY = "nftables load balancer"
DESCRIPTION = "nftlb a user-space tool that builds a complete load balancer and \
traffic distributor using nftables. \
 \
* Topologies supported: Destination NAT, Source NAT, Direct Server \
  Return and Stateless DNAT. This enables the use of the load \
  balancer in one-armed and two-armed network architectures. \
* Support for both IPv4 and IPv6 families. \
* Multilayer load balancer: DSR in layer 2, IP based load balancing \
  with protocol agnostic at layer 3, and support of load balancing of \
  UDP, TCP and SCTP at layer 4. \
* Multiport support for ranges and lists of ports. \
* Multiple virtual services (or farms) support. \
* Schedulers available: weight, round robin, configurable hash (per \
  IP, port, MAC or combination of them) and symmetric hash. \
* Support of configurable persistence or client-backend affinity with \
  a timeout (per IP, port, MAC or combination of them). \
* Support of security policies per service: white and blacklists \
  (from ingress), queuing to user space filter, filtering of bogus \
  TCP frames, maximum number of established connections, limit TCP \
  RST per second, limit new connections per second and more. \
* Priority support per backend. \
* Live management of virtual services and backends programmatically \
  through a JSON API."
LICENSE = "AGPL-3.0-or-later"

PV = "1.0.7"

RPM_NAME = "nftlb-1.0.7-1.3.aarch64.rpm"
RPM_HASH = "09516db95155025b4d0cff949063b4429ce0b573ed2fd28f575c261c9d417e0fd3f5246bcb66061972566bd3275805a03e114e32a495a5df7201db05b639b21a"

RPROVIDES:${PN} += "nftlb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libev.so.4 \
libjansson.so.4 \
libmnl.so.0 \
libnftables.so.1"

inherit rpm
