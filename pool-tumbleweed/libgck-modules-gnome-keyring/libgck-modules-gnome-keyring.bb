SUMMARY = "Glib wrapper library for PKCS#11 - Modules"
DESCRIPTION = "GCK is a wrapper based on GLib implementing the PKCS#11 (Cryptoki) \
interface. \
 \
This package contains various PKCS#11 modules, to expose keys and \
certificates from different sources."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "42.1"

RPM_NAME = "libgck-modules-gnome-keyring-42.1-2.4.aarch64.rpm"
RPM_HASH = "5ee877b3de6b5462a64f6923e119d46533306903ab1816fe877c48148f9d3950a68ceda70c1c153b000e4374998cff478a7433cf6fc533b23d50127097940612"

RPROVIDES:${PN} += "libgck-modules-gnome-keyring"

RDEPENDS:${PN} += "gck \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
