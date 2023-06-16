SUMMARY = "GNS3 graphical interface for the GNS3 server"
DESCRIPTION = "GNS3 is an excellent complementary tool to real labs for network engineers, \
administrators and people wanting to study for certifications such as Cisco \
CCNA, CCNP, CCIP and CCIE as well as Juniper JNCIA, JNCIS and JNCIE. \
 \
It can also be used to experiment features of Cisco IOS, Juniper JunOS or to \
check configurations that need to be deployed later on real routers. \
 \
Thanks to VirtualBox integration, now even system engineers and administrators \
can take advantage of GNS3 to study Redhat (RHCE, RHCT), Microsoft (MSCE, \
MSCA), Novell (CLP) and many other vendor certifications."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.38"

RPM_NAME = "gns3-gui-2.2.38-1.2.noarch.rpm"
RPM_HASH = "680b0958058f497a5d959357ff71549fe636da4cd43f3c05f0d98127635d36c6608f4c72b79490ae69c3abc3e9ad15bef6772afd74668a2f8fa57d58f9e78740"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gns3-gui \
python3.10dist-gns3-gui \
python3dist-gns3-gui"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-distro \
python3-jsonschema \
python3-psutil \
python3-qt5 \
python3-sentry-sdk"

inherit rpm
