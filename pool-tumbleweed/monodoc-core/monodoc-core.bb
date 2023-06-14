SUMMARY = "Monodoc - Documentation tools for C# code"
DESCRIPTION = "Monodoc-core contains documentation tools for C#."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "monodoc-core-6.12.0-5.3.aarch64.rpm"
RPM_HASH = "7187b8e2bdb40980b4eb2f27c1df9936893c8c55b67da7ffff5cfe840b5973ffa88395090028684f478f3184c28522def136cbc084cff6f2c7819944eb643c93"

RPROVIDES:${PN} += "mono-mdoc \
mono-mod \
mono-monodoc \
monodoc \
monodoc-core \
monodoc-devel \
pkgconfig-monodoc"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
mono-ICSharpCode.SharpZipLib \
mono-Mono.Cecil \
mono-System \
mono-System.Configuration \
mono-System.Core \
mono-System.Xml \
mono-System.Xml.Linq \
mono-core \
mono-mscorlib \
unzip"

inherit rpm
