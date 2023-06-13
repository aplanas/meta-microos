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

RPM_NAME = "python310-pyroute2-0.7.3-1.4.noarch.rpm"
RPM_HASH = "9fba996d9767edd43c01f76da405877b73afcd3a126bd50de615856cb15b20c2f8cac4fca2e57b83c857e15b7e438ab5dfeabe4d42e17c4644f2f15acd4b2aeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyroute2 \
python3-pyroute2.core \
python3-pyroute2.ethtool \
python3-pyroute2.ipdb \
python3-pyroute2.ipset \
python3-pyroute2.ndb \
python3-pyroute2.nftables \
python3-pyroute2.nslink \
python3.10dist(pyroute2) \
python310-pyroute2 \
python310-pyroute2.core \
python310-pyroute2.ethtool \
python310-pyroute2.ipdb \
python310-pyroute2.ipset \
python310-pyroute2.ndb \
python310-pyroute2.nftables \
python310-pyroute2.nslink \
python3dist(pyroute2)"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
