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

RPM_NAME = "mono-extras-6.12.0-5.4.aarch64.rpm"
RPM_HASH = "81b8caa3b4cbb8a15bc6b3ae1772fd1623668a407c0d2299f5cd6d2da27bdf852280b73b1b3f17b7b344bc495fafbb2c23e6639056e53396e333975ba1db068a"

RPROVIDES:${PN} += "mono-Mono.Messaging \
mono-Mono.Messaging.RabbitMQ \
mono-RabbitMQ.Client \
mono-RabbitMQ.Client.Apigen \
mono-System.Configuration.Install \
mono-System.Management \
mono-System.Messaging \
mono-System.Runtime.Caching \
mono-System.ServiceProcess \
mono-System.ServiceProcess.ServiceController \
mono-System.Xaml \
mono-extras \
mono-installutil \
mono-mono-service \
mono-ms-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
mono-Mono.Posix \
mono-System \
mono-System.Configuration \
mono-System.Core \
mono-System.Data \
mono-System.Drawing \
mono-System.Windows.Forms \
mono-System.Xml \
mono-core \
mono-mscorlib"

inherit rpm
