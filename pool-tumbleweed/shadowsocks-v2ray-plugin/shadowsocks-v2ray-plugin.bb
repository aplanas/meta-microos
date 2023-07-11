SUMMARY = "SIP003 plugin for shadowsocks"
DESCRIPTION = "Yet another SIP003 plugin for shadowsocks, based on v2ray"
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "shadowsocks-v2ray-plugin-1.3.2-1.1.aarch64.rpm"
RPM_HASH = "c353bf6d34b32e020003494453deae78cb61bfd67b2040cd1c0ec2b44bb25a5221d76860722b46429f64ad919e976c1825a9a655fe723a18efeb393c139a5a27"

RPROVIDES:${PN} += "shadowsocks-v2ray-plugin"

RDEPENDS:${PN} += ""

inherit rpm
