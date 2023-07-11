SUMMARY = "Development files shared by Samba subpackages"
DESCRIPTION = "This package contains the libraries and header files needed to \
develop programs which make use of Samba."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.3+git.303.c08b73d523c"

RPM_NAME = "samba-devel-4.18.3+git.303.c08b73d523c-1.2.aarch64.rpm"
RPM_HASH = "0689a0f79169c54aa066cbda3550809c298ef1dfdcd8434685379fb612ec0297ae0d0c3c1adf0aab6fbc1b76d51838f6dbecfae60296e57c3f0c277d9ccd22a3"

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
