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

RPM_NAME = "python310-pyroute2-0.7.3-1.6.noarch.rpm"
RPM_HASH = "c72e40b43f7f320c3ddecbaa2db7ae843b5ff4290a66c3bb12c114a378d5abbf45bffc894ee145f75de3139345aa03757568f075b5da2d93618b5df8bb04ec07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyroute2 \
python310-pyroute2 \
python310-pyroute2.core \
python310-pyroute2.ethtool \
python310-pyroute2.ipdb \
python310-pyroute2.ipset \
python310-pyroute2.ndb \
python310-pyroute2.nftables \
python310-pyroute2.nslink \
python3dist-pyroute2"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
python-abi \
update-alternatives"

inherit rpm
