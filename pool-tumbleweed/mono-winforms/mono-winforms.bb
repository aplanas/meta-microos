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

RPM_NAME = "mono-winforms-6.12.0-5.3.aarch64.rpm"
RPM_HASH = "b301fb135149afef1eb9e8cbd88027b5bcc27fc8ae4a088ba0b20fea4dfebb7c338cee47e75c7ef1071615e04d8f989c579bf51d83d1d81f7a4d095f94664641"

RPROVIDES:${PN} += "mono(Accessibility) \
mono(Mono.WebBrowser) \
mono(System.Design) \
mono(System.Drawing) \
mono(System.Drawing.Design) \
mono(System.Windows.Forms) \
mono(System.Windows.Forms.DataVisualization) \
mono-window-forms \
mono-winforms \
mono-winforms(aarch-64)"
RDEPENDS:${PN} += "mono(Mono.Posix) \
mono(System) \
mono(System.Configuration) \
mono(System.Core) \
mono(System.Data) \
mono(System.Drawing) \
mono(System.Runtime.Serialization.Formatters.Soap) \
mono(System.Web) \
mono(System.Xml) \
mono(mscorlib) \
mono-core"

inherit rpm
