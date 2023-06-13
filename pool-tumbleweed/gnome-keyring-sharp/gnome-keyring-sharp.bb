SUMMARY = "Managed Implementation of libgnome-keyring"
DESCRIPTION = "When the gnome-keyring-daemon is running, you can use this to \
retrieve/store confidential information such as passwords, notes or \
network services user information."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "gnome-keyring-sharp-1.0.2-25.24.aarch64.rpm"
RPM_HASH = "987f8d61255daac1ea6496e4f803a8720dac5bb437a2687b7eed19ef63eb7284f85b64cfaee46e62c07e4802aa924cff40ac54cf068a77dadf89d42211469dac"

RPROVIDES:${PN} += "gnome-keyring-sharp \
gnome-keyring-sharp(aarch-64) \
libgnome-keyring-sharp-glue.so()(64bit) \
mono(Gnome.Keyring)"

RDEPENDS:${PN} += "gnome-keyring \
libgnome-keyring.so.0()(64bit) \
mono(glib-sharp) \
mono(mscorlib)"

inherit rpm
