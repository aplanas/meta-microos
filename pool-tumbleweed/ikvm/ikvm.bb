SUMMARY = "A JVM Based on the Mono Runtime"
DESCRIPTION = "This package provides IKVM.NET, an open source Java compatibility layer \
for Mono, which includes a Virtual Machine, a bytecode compiler, and \
various class libraries for Java, as well as tools for Java and Mono \
interoperability."
LICENSE = "BSD-3-Clause"

PV = "8.0.5449.1"

RPM_NAME = "ikvm-8.0.5449.1-1.17.noarch.rpm"
RPM_HASH = "3850fc67f63eb2d57df4c821a3af92c7e54005f6f912a3aca0d46a8216522c657d48a67a2160e9f46f65a8785823990833d4bd303c1297547cf5e91f09b00cfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ikvm \
mono-ICSharpCode.SharpZipLib \
mono-IKVM.AWT.WinForms \
mono-IKVM.OpenJDK.Beans \
mono-IKVM.OpenJDK.Charsets \
mono-IKVM.OpenJDK.Cldrdata \
mono-IKVM.OpenJDK.Corba \
mono-IKVM.OpenJDK.Core \
mono-IKVM.OpenJDK.Jdbc \
mono-IKVM.OpenJDK.Localedata \
mono-IKVM.OpenJDK.Management \
mono-IKVM.OpenJDK.Media \
mono-IKVM.OpenJDK.Misc \
mono-IKVM.OpenJDK.Naming \
mono-IKVM.OpenJDK.Nashorn \
mono-IKVM.OpenJDK.Remoting \
mono-IKVM.OpenJDK.Security \
mono-IKVM.OpenJDK.SwingAWT \
mono-IKVM.OpenJDK.Text \
mono-IKVM.OpenJDK.Tools \
mono-IKVM.OpenJDK.Util \
mono-IKVM.OpenJDK.XML.API \
mono-IKVM.OpenJDK.XML.Bind \
mono-IKVM.OpenJDK.XML.Crypto \
mono-IKVM.OpenJDK.XML.Parse \
mono-IKVM.OpenJDK.XML.Transform \
mono-IKVM.OpenJDK.XML.WebServices \
mono-IKVM.OpenJDK.XML.XPath \
mono-IKVM.Reflection \
mono-IKVM.Runtime \
mono-IKVM.Runtime.JNI \
mono-ikvm \
mono-ikvmc \
mono-ikvmstub \
pkgconfig-ikvm"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
mono-System \
mono-System.Configuration \
mono-System.Core \
mono-System.Data \
mono-System.Drawing \
mono-System.Security \
mono-System.Windows.Forms \
mono-System.Xml \
mono-ikvm \
mono-mscorlib"

inherit rpm
