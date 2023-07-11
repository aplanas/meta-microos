SUMMARY = "The ActiveDirectory backend plugin for sssd"
DESCRIPTION = "Provides the Active Directory back end that the SSSD can utilize to \
fetch identity data from and authenticate against an Active Directory \
server."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "sssd-ad-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "b55a0ed482dcdcbaa02a32527577969bda3a6dcd7a0d33389e811c5382a7232207166aec60519937587567da363777c3ec2f19a35384f95bb5d13043e64799f8"

RPROVIDES:${PN} += "libsss-ad.so \
sssd-ad"

RDEPENDS:${PN} += "adcli \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdhash.so.1 \
libini-config.so.5 \
libldap.so.2 \
libldb.so.2 \
libndr-krb5pac.so.0 \
libndr-nbt.so.0 \
libndr.so.3 \
libpopt.so.0 \
libsasl2.so.3 \
libselinux.so.1 \
libsmbclient.so.0 \
libsss-child.so \
libsss-debug.so \
libsss-idmap.so.0 \
libsss-iface.so \
libsss-krb5-common.so \
libsss-ldap-common.so \
libsss-sbus.so \
libsss-util.so \
libsystemd.so.0 \
libtalloc.so.2 \
libtdb.so.1 \
libtevent.so.0 \
sssd-krb5-common"

inherit rpm
