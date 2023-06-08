SUMMARY = "Cockpit user interface for kernel crash dumping"
DESCRIPTION = "The Cockpit component for configuring kernel crash dumping."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-kdump-276.1-4.3.noarch.rpm"
RPM_HASH = "a856c8ce818e7397dad4a0147c1e68732ab064c016929876c3b9b0a49a99b66e6173bd61c75f1166e4ab9b7d3b9f6d6be63a5e59c20603afb2c47f7cc97cd42d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-kdump metainfo() metainfo(org.cockpit-project.cockpit-kdump.metainfo.xml)"
RDEPENDS:${PN} += "cockpit-bridge cockpit-shell kexec-tools"

inherit rpm
