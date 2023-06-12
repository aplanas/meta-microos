SUMMARY = "Development files shared by Samba subpackages"
DESCRIPTION = "This package contains the libraries and header files needed to \
develop programs which make use of Samba."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-devel-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "287f59c55eeebe03cff0ef5e72a168186d035568f23528ace634ed3d9ba1c5b761fb0cd790d8d959dda22359fb08adf44c51c1720284910a30717032f0a163b0"

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
pkgconfig(dcerpc) \
pkgconfig(dcerpc_samr) \
pkgconfig(dcerpc_server) \
pkgconfig(ndr) \
pkgconfig(ndr_krb5pac) \
pkgconfig(ndr_nbt) \
pkgconfig(ndr_standard) \
pkgconfig(netapi) \
pkgconfig(samba-credentials) \
pkgconfig(samba-hostconfig) \
pkgconfig(samba-util) \
pkgconfig(samdb) \
pkgconfig(smbclient) \
pkgconfig(wbclient) \
samba-core-devel \
samba-devel \
samba-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig(dcerpc) \
pkgconfig(krb5) \
pkgconfig(ndr) \
pkgconfig(ndr_standard) \
pkgconfig(samba-util) \
pkgconfig(talloc) \
pkgconfig(tevent) \
samba-ad-dc-libs \
samba-client-libs \
samba-libs \
samba-winbind-libs"

inherit rpm
