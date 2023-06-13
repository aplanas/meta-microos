SUMMARY = "GNOME keyring sypport for Subversion"
DESCRIPTION = "Provides GNOME keyring support for Subversion"
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "libsvn_auth_gnome_keyring-1-0-1.14.2-5.3.aarch64.rpm"
RPM_HASH = "03ae1c667282dda99d4140acdfe1f99850c2141aabb058ce0060c8702f97dfb419426bcd4332092859cea8bb5f609a528d3afa82606951fe06fdfcc2f2715bbc"

RPROVIDES:${PN} += "libsvn_auth_gnome_keyring-1-0 \
libsvn_auth_gnome_keyring-1-0(aarch-64) \
libsvn_auth_gnome_keyring-1.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libapr-1.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsecret-1.so.0()(64bit) \
libsvn_subr-1.so.0()(64bit) \
subversion"

inherit rpm
