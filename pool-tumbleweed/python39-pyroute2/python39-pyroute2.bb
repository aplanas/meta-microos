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

RPM_NAME = "python39-pyroute2-0.7.3-1.4.noarch.rpm"
RPM_HASH = "67d90310cb41c01e07e13bc52a9fe8b1e4eb7acecf1672bf2290a229c7af4a46b6469bbea2809557340a33a3e741e3bb670eb2096c1a349108829cf60c94afe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyroute2) \
python39-pyroute2 \
python39-pyroute2.core \
python39-pyroute2.ethtool \
python39-pyroute2.ipdb \
python39-pyroute2.ipset \
python39-pyroute2.ndb \
python39-pyroute2.nftables \
python39-pyroute2.nslink \
python3dist(pyroute2)"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
