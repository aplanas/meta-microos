SUMMARY = "Python modules for Ceph iSCSI gateway configuration management"
DESCRIPTION = "Python package providing the modules used to handle the configuration of an \
iSCSI gateway, backed by Ceph RBD. The RPM installs configuration management \
logic (ceph_iscsi_config modules), an rbd-target-gw systemd service, and \
a CLI-based management tool 'gwcli', replacing the 'targetcli' tool. \
 \
The configuration management modules may be are consumed by custom Ansible \
playbooks and the rbd-target-gw daemon. \
 \
The rbd-target-gw service is responsible for startup and shutdown actions, \
replacing the 'target' service used in standalone LIO implementations. \
In addition, rbd-target-gw also provides a REST API utilized by the Ceph \
dashboard and gwcli tool, and a prometheus exporter for gateway LIO \
performance statistics, supporting monitoring and visualisation tools like \
Grafana."
LICENSE = "GPL-3.0-or-later"

PV = "3.5+1679292226.g8769429"

RPM_NAME = "ceph-iscsi-3.5+1679292226.g8769429-1.1.aarch64.rpm"
RPM_HASH = "6cfa60be90c5d745e538524d9fc70fd23dac17da7bbe5965d1d60aa4d558dc1e806ae8c52d9281980c5885881847711f6fb5e63be0fec995ef04d535df1de5f0"

RPROVIDES:${PN} += "ceph-iscsi ceph-iscsi(aarch-64) python3.10dist(ceph-iscsi) python3dist(ceph-iscsi)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 ceph-common python(abi) python3-Flask python3-configshell-fb python3-cryptography python3-netifaces python3-pyOpenSSL python3-rados python3-rbd python3-requests python3-rtslib systemd tcmu-runner"

inherit rpm
