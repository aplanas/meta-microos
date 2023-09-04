SUMMARY = "389 Directory Server administration tools and library"
DESCRIPTION = "Python library for interacting with and administering 389 \
Directory Server instances locally or remotely."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "2.4.0~git74.4297d88"

RPM_NAME = "lib389-2.4.0~git74.4297d88-1.1.aarch64.rpm"
RPM_HASH = "bb1088cae3b656a936379b020f00a311a44991f27c17ffedddfdd6e4e6ccfb091d78f1c1e12ce0f8626f6f22e1c86b7aca1f79dd4e95154cc46ab2f6801f4265"

RPROVIDES:${PN} += "lib389 \
python3-lib389 \
python3.11dist-lib389 \
python3dist-lib389"

RDEPENDS:${PN} += "/usr/bin/python3 \
iproute2 \
krb5-client \
mozilla-nss-tools \
openssl-cli \
python-abi \
python3-argcomplete \
python3-argparse-manpage \
python3-cryptography \
python3-distro \
python3-ldap \
python3-pyasn1 \
python3-pyasn1-modules \
python3-python-dateutil \
python3-python-slugify"

inherit rpm
