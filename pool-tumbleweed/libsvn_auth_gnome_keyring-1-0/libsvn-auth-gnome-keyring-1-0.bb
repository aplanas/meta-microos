SUMMARY = "GNOME keyring sypport for Subversion"
DESCRIPTION = "Provides GNOME keyring support for Subversion"
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "libsvn_auth_gnome_keyring-1-0-1.14.2-6.1.aarch64.rpm"
RPM_HASH = "c18bb4046a02150c1d8dd55b76ab87a06165599b2b29a095bcef8af005943ae39431a9d72e0748ed474b14763b3bdf21df9e9ecafe0ca2fc1191b7ac30b7c249"

RPROVIDES:${PN} += "libsvn-auth-gnome-keyring-1-0 \
libsvn-auth-gnome-keyring-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libapr-1.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsecret-1.so.0 \
libsvn-subr-1.so.0 \
subversion"

inherit rpm
