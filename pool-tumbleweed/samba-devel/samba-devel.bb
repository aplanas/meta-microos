SUMMARY = "Development files shared by Samba subpackages"
DESCRIPTION = "This package contains the libraries and header files needed to \
develop programs which make use of Samba."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.6+git.320.cfda27bacb"

RPM_NAME = "samba-devel-4.18.6+git.320.cfda27bacb-1.1.aarch64.rpm"
RPM_HASH = "4e32b85c10c02e5d875cd312a2d2067d1ac9d08538e7455a355c54ef920fa7ce11b12a28f85f2035abfc1b1fa3acc1f38b107c37ee12316fbf2246fd800b2e2e"

RPROVIDES:${PN} += "libdcerpc-devel \
libdcerpc-samr-devel \
libndr-devel \
libndr-krb5pac-devel \
libndr-nbt-devel \
libndr-standard-devel \
libnetapi-devel \
libsamba-credentials-devel \
libsamba-errors-devel \
libsamba-hostconfig-devel \
libsamba-passdb-devel \
libsamba-util-devel \
libsamdb-devel \
libsmbclient-devel \
libsmbconf-devel \
libsmbldap-devel \
libtevent-util-devel \
libwbclient-devel \
libwbclient0-devel \
pkgconfig-dcerpc \
pkgconfig-dcerpc-samr \
pkgconfig-dcerpc-server \
pkgconfig-ndr \
pkgconfig-ndr-krb5pac \
pkgconfig-ndr-nbt \
pkgconfig-ndr-standard \
pkgconfig-netapi \
pkgconfig-samba-credentials \
pkgconfig-samba-hostconfig \
pkgconfig-samba-util \
pkgconfig-samdb \
pkgconfig-smbclient \
pkgconfig-wbclient \
samba-core-devel \
samba-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-dcerpc \
pkgconfig-krb5 \
pkgconfig-ndr \
pkgconfig-ndr-standard \
pkgconfig-samba-util \
pkgconfig-talloc \
pkgconfig-tevent \
samba-ad-dc-libs \
samba-client-libs \
samba-libs \
samba-winbind-libs"

inherit rpm
