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

PV = "2.2.40.1"

RPM_NAME = "gns3-gui-2.2.40.1-1.1.noarch.rpm"
RPM_HASH = "17b5bbc8cc98b95e00aa49a6a37e02235bdf1c553c2c91a9ce1126ea8458aec683b70b93e0f51cb077544ef4373cc0545172d0aaf13b25f911716131a0b5cf9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gns3-gui \
python3.11dist-gns3-gui \
python3dist-gns3-gui"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.11 \
python-abi \
python3-distro \
python3-jsonschema \
python3-psutil \
python3-qt5 \
python3-sentry-sdk"

inherit rpm
