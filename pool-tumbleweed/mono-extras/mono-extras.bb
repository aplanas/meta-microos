SUMMARY = "Extra packages"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Extra packages."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "mono-extras-6.12.0-5.3.aarch64.rpm"
RPM_HASH = "ffb76000b058749c7723e5d62cd9d595b628b0076f29a6532b24d36826202f169dc4aa657b2ff6b55efeead85fe42626149450d8aaaa588d17602593aa19ca3d"

RPROVIDES:${PN} += "mono(Mono.Messaging) \
mono(Mono.Messaging.RabbitMQ) \
mono(RabbitMQ.Client) \
mono(RabbitMQ.Client.Apigen) \
mono(System.Configuration.Install) \
mono(System.Management) \
mono(System.Messaging) \
mono(System.Runtime.Caching) \
mono(System.ServiceProcess) \
mono(System.ServiceProcess.ServiceController) \
mono(System.Xaml) \
mono(installutil) \
mono(mono-service) \
mono-extras \
mono-extras(aarch-64) \
mono-ms-extras"

RDEPENDS:${PN} += "/bin/sh \
mono(Mono.Posix) \
mono(System) \
mono(System.Configuration) \
mono(System.Core) \
mono(System.Data) \
mono(System.Drawing) \
mono(System.Windows.Forms) \
mono(System.Xml) \
mono(mscorlib) \
mono-core"

inherit rpm
