SUMMARY = "Python Netlink library"
DESCRIPTION = "Pyroute2 is a pure Python netlink library. It requires only Python stdlib, no \
3rd party libraries. The library was started as an RTNL protocol \
implementation, so the name is pyroute2, but now it supports many netlink \
protocols. Some supported netlink families and protocols: \
 \
  * rtnl, network settings --- addresses, routes, traffic controls \
  * nfnetlink --- netfilter API: ipset, nftables, ... \
  * ipq --- simplest userspace packet filtering, iptables QUEUE target \
  * devlink --- manage and monitor devlink-enabled hardware \
  * generic --- generic netlink families \
  * nl80211 --- wireless functions API (basic support) \
  * taskstats --- extended process statistics \
  * acpi_events --- ACPI events monitoring \
  * thermal_events --- thermal events monitoring \
  * VFS_DQUOT --- disk quota events monitoring"
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "0.7.3"

RPM_NAME = "python39-pyroute2-0.7.3-1.6.noarch.rpm"
RPM_HASH = "3e7fd3e846e69e65150f8db71619f20564521817cb7e0beed465ca6c4c16266fb0f1f7980804c0465b64d3e5c5783f5987d2dc8cd76eb3dde8e8ef7f080a0ff5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyroute2 \
python39-pyroute2 \
python39-pyroute2.core \
python39-pyroute2.ethtool \
python39-pyroute2.ipdb \
python39-pyroute2.ipset \
python39-pyroute2.ndb \
python39-pyroute2.nftables \
python39-pyroute2.nslink \
python3dist-pyroute2"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
python-abi \
update-alternatives"

inherit rpm
