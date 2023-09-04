SUMMARY = "GNOME keyring sypport for Subversion"
DESCRIPTION = "Provides GNOME keyring support for Subversion"
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "libsvn_auth_gnome_keyring-1-0-1.14.2-6.2.aarch64.rpm"
RPM_HASH = "a7412b07596386952bc780bab20f4638a6121687a75101d06b14f76ccfa5e55ab5db30e5153078b44deaae4d958166b886c4d75da0491d13b509a6ae00062b6f"

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
