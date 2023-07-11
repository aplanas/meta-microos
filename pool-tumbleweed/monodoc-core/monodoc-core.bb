SUMMARY = "Monodoc - Documentation tools for C# code"
DESCRIPTION = "Monodoc-core contains documentation tools for C#."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "monodoc-core-6.12.0-5.4.aarch64.rpm"
RPM_HASH = "23bb88d27c4ace7864474bd9ad3631ed0a0d946ee46901b5b017aebab801512dfea02162a91f85bcdbea6282da4beff98a809e2d19679b95dc7bf3e6e67c821e"

RPROVIDES:${PN} += "mono-mdoc \
mono-mod \
mono-monodoc \
monodoc \
monodoc-core \
monodoc-devel \
pkgconfig-monodoc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
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
