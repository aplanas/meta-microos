SUMMARY = "Development files shared by Samba subpackages"
DESCRIPTION = "This package contains the libraries and header files needed to \
develop programs which make use of Samba."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.5+git.313.c8e274c7852"

RPM_NAME = "samba-devel-4.18.5+git.313.c8e274c7852-1.1.aarch64.rpm"
RPM_HASH = "d288a272eab59c8d755db52b6583b07afab00309d74215e77e276be962464c9c1ab72f918951edce6924264e50e6f8fdcf8a47003f467b523e92c789af3a4143"

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
