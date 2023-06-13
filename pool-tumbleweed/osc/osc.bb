SUMMARY = "Command-line client for the Open Build Service"
DESCRIPTION = "OpenSUSE Commander is a command-line client for the Open Build Service. \
 \
See http://en.opensuse.org/openSUSE:OSC, as well as \
http://en.opensuse.org/openSUSE:Build_Service_Tutorial \
for a general introduction."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.4"

RPM_NAME = "osc-1.1.4-1.1.noarch.rpm"
RPM_HASH = "9164296d40ffd779cc30c756614089db296f4dd516e46aa6b6ef2e8e936932471e7fa8f2aade712dfc0c07fe209627343ba952605d4847b9529b586ed5c16d0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osc \
python3-osc \
python3.10dist(osc) \
python3dist(osc) \
rpm_macro(osc_plugin_dir)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
python(abi) \
python3-cryptography \
python3-rpm \
python3-urllib3"

inherit rpm
