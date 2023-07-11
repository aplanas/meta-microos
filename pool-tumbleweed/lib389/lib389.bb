SUMMARY = "389 Directory Server administration tools and library"
DESCRIPTION = "Python library for interacting with and administering 389 \
Directory Server instances locally or remotely."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "2.4.0~git18.37ec5cd"

RPM_NAME = "lib389-2.4.0~git18.37ec5cd-1.3.aarch64.rpm"
RPM_HASH = "e7981493cf0d2e950a4b48daf88b8543aee3ae2df0fcd64d4fde17285952cdecde162274a51bca010e61b2481b3982df2d248161d6b31364c180ccf81624a6dc"

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
