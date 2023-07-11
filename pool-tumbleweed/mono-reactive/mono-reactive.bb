SUMMARY = "Reactive Extensions"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Microsoft's Reactive Extensions."
LICENSE = "Apache-2.0"

PV = "6.12.0"

RPM_NAME = "mono-reactive-6.12.0-5.4.aarch64.rpm"
RPM_HASH = "3e390a08216fb42956d5d4f1c4afa96638be1ef7a85b12520b51524fd1330433736d3e26bc00063123659c71dfd52bfe69e265313c174145a491ac65f6837f6f"

RPROVIDES:${PN} += "mono-System.Reactive.Core \
mono-System.Reactive.Debugger \
mono-System.Reactive.Experimental \
mono-System.Reactive.Interfaces \
mono-System.Reactive.Linq \
mono-System.Reactive.Observable.Aliases \
mono-System.Reactive.PlatformServices \
mono-System.Reactive.Providers \
mono-System.Reactive.Runtime.Remoting \
mono-System.Reactive.Windows.Forms \
mono-System.Reactive.Windows.Threading \
mono-reactive \
pkgconfig-reactive"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
mono-System \
mono-System.Core \
mono-System.Windows.Forms \
mono-WindowsBase \
mono-core \
mono-mscorlib"

inherit rpm
