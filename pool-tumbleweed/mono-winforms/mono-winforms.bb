SUMMARY = "Mono's Windows Forms implementation"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Mono's Windows Forms implementation."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "mono-winforms-6.12.0-5.4.aarch64.rpm"
RPM_HASH = "e45a92accf58aa5abbae13024397ecf3226231ba6656c40645c20012c4c11582b168f29c9e398d9a6a0f8b6e9a099f53143c1d7922c94dd4e288cefc5571c4db"

RPROVIDES:${PN} += "mono-Accessibility \
mono-Mono.WebBrowser \
mono-System.Design \
mono-System.Drawing \
mono-System.Drawing.Design \
mono-System.Windows.Forms \
mono-System.Windows.Forms.DataVisualization \
mono-window-forms \
mono-winforms"

RDEPENDS:${PN} += "mono-Mono.Posix \
mono-System \
mono-System.Configuration \
mono-System.Core \
mono-System.Data \
mono-System.Drawing \
mono-System.Runtime.Serialization.Formatters.Soap \
mono-System.Web \
mono-System.Xml \
mono-core \
mono-mscorlib"

inherit rpm
