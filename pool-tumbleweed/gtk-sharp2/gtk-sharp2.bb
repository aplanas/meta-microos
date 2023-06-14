SUMMARY = ".Net Language Bindings for GTK+"
DESCRIPTION = "This package contains Mono bindings for gtk+, gdk, atk, and pango."
LICENSE = "GPL-2.0-only"

PV = "2.12.45"

RPM_NAME = "gtk-sharp2-2.12.45-3.8.aarch64.rpm"
RPM_HASH = "e4c3d9dee2b1852f0024812322753f434b90edf9154bc2fc27d016255be31cacb4427715692136c3848f8f750fe2614390400c2551d956bfc6b044cf07b7238f"

RPROVIDES:${PN} += "gtk-sharp2 \
libatksharpglue-2.so \
libgdksharpglue-2.so \
libgtksharpglue-2.so \
libpangosharpglue-2.so \
mono-atk-sharp \
mono-gdk-sharp \
mono-gtk-dotnet \
mono-gtk-sharp \
mono-pango-sharp \
mono-policy.2.10.atk-sharp \
mono-policy.2.10.gdk-sharp \
mono-policy.2.10.gtk-dotnet \
mono-policy.2.10.gtk-sharp \
mono-policy.2.10.pango-sharp \
mono-policy.2.4.atk-sharp \
mono-policy.2.4.gdk-sharp \
mono-policy.2.4.gtk-dotnet \
mono-policy.2.4.gtk-sharp \
mono-policy.2.4.pango-sharp \
mono-policy.2.6.atk-sharp \
mono-policy.2.6.gdk-sharp \
mono-policy.2.6.gtk-dotnet \
mono-policy.2.6.gtk-sharp \
mono-policy.2.6.pango-sharp \
mono-policy.2.8.atk-sharp \
mono-policy.2.8.gdk-sharp \
mono-policy.2.8.gtk-dotnet \
mono-policy.2.8.gtk-sharp \
mono-policy.2.8.pango-sharp \
pkgconfig-gtk-dotnet-2.0 \
pkgconfig-gtk-sharp-2.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
mono-Mono.Cairo \
mono-System.Drawing \
mono-glib-sharp \
mono-mscorlib \
pkgconfig-glib-sharp-2.0 \
pkgconfig-gtk-sharp-2.0"

inherit rpm
