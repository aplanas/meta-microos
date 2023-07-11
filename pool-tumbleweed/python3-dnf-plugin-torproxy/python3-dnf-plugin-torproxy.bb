SUMMARY = "Tor Proxy Plugin for DNF"
DESCRIPTION = "Tor proxy plugin forces DNF to use Tor to download packages. It makes sure that \
Tor is working and avoids leaking the hostname by using the proper SOCKS5 interface."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.17"

RPM_NAME = "python3-dnf-plugin-torproxy-4.0.17-2.2.noarch.rpm"
RPM_HASH = "8a82b6ec7f2e051f54f2c2d784663db5571f7a0bb31ac6be43b8bb53cff57e86f9c21efbe2c264a47fd56b99de7237054684b424e37d0e797396457703c0419d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-dnf-plugin-torproxy \
dnf-plugin-torproxy \
dnf-plugins-extras-torproxy \
python3-dnf-plugin-torproxy \
python3-dnf-plugins-extras-torproxy"

RDEPENDS:${PN} += "python-abi \
python3-dnf-plugins-extras-common \
python3-pycurl"

inherit rpm
