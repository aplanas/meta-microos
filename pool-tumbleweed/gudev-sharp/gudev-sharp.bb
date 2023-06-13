SUMMARY = ".NET/C# Bindings for GUDev"
DESCRIPTION = "C#/CLI bindings for GUDev"
LICENSE = "LGPL-2.1"

PV = "0.2"

RPM_NAME = "gudev-sharp-0.2-21.11.aarch64.rpm"
RPM_HASH = "b763c834b4d0a0b1fd4369256072f2c354fadf9bc4f227157a888aaebe147db9524540e41e299d7830c1ed8b158559a4e49c99e32bf42e8ee468a5df6a9ebdb8"

RPROVIDES:${PN} += "gudev-sharp \
gudev-sharp(aarch-64) \
mono(gudev-sharp)"

RDEPENDS:${PN} += "gtk-sharp2 \
libgudev-1_0-0 \
mono(glib-sharp) \
mono(mscorlib) \
mono-core"

inherit rpm
