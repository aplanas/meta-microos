SUMMARY = "LibCVC API -- Introspection bindings"
DESCRIPTION = "Utility library for volume control of pulseaudio from gobject-based \
Cinnamon modules/applications. \
 \
This package provides the GObject Introspection bindings for libcvc."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.8.0"

RPM_NAME = "typelib-1_0-Cvc-1_0-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "3585b8b9164b18d64b5745193a9b1a1b4a72a2518b4ad42e161bac90be499601304e3f1d243bdcee09792efb042e510702a58cf32d7c7d3aebdd3dc9b2768d1a"

RPROVIDES:${PN} += "typelib-1-0-Cvc-1-0 \
typelib-Cvc"

RDEPENDS:${PN} += "libcvc.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
