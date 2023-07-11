SUMMARY = "Managed Implementation of libgnome-keyring"
DESCRIPTION = "When the gnome-keyring-daemon is running, you can use this to \
retrieve/store confidential information such as passwords, notes or \
network services user information."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "gnome-keyring-sharp-1.0.2-25.25.aarch64.rpm"
RPM_HASH = "7582c2b55abad70f5a9d95d6182dfe4edf43dcd0719c503ab1d6f2c8608cebdce669d4588df95e266730668234872598670f2256f5d2f2f806e6562e64759424"

RPROVIDES:${PN} += "gnome-keyring-sharp \
libgnome-keyring-sharp-glue.so \
mono-Gnome.Keyring"

RDEPENDS:${PN} += "gnome-keyring \
libgnome-keyring.so.0 \
mono-glib-sharp \
mono-mscorlib"

inherit rpm
