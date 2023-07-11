SUMMARY = "Common code for the yast python ad modules"
DESCRIPTION = "Common code shared by the yast2-aduc, yast2-adsi, and yast2-gpmc modules."
LICENSE = "GPL-3.0-or-later"

PV = "1.6"

RPM_NAME = "yast2-adcommon-python-1.6-1.9.noarch.rpm"
RPM_HASH = "f3031289cf459d01a839753f1fa9625e1b9554564bc2934207af8337e222426003418a056cf8fa510f5879dc3115a403b013355b26e64becb870b935a825f30c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-adcommon-python"

RDEPENDS:${PN} += "krb5-client \
python-abi \
python3-keyring \
python3-ldap \
python3-ldb \
samba-client \
samba-dsdb-modules \
samba-python3 \
yast2 \
yast2-python3-bindings"

inherit rpm
