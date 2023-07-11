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

RPM_NAME = "python311-pyroute2-0.7.3-1.6.noarch.rpm"
RPM_HASH = "7fc5da9d53b5b009e44cfb129ab236805ad9ed023d5920c0b6b85880f5b96e9253c6b4e5ce72a78920834b1372e20ea32dc98542c33b19b7eeb5be2494d3e19f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyroute2 \
python3-pyroute2.core \
python3-pyroute2.ethtool \
python3-pyroute2.ipdb \
python3-pyroute2.ipset \
python3-pyroute2.ndb \
python3-pyroute2.nftables \
python3-pyroute2.nslink \
python3.11dist-pyroute2 \
python311-pyroute2 \
python311-pyroute2.core \
python311-pyroute2.ethtool \
python311-pyroute2.ipdb \
python311-pyroute2.ipset \
python311-pyroute2.ndb \
python311-pyroute2.nftables \
python311-pyroute2.nslink \
python3dist-pyroute2"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python-abi \
update-alternatives"

inherit rpm
