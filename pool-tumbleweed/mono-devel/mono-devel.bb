SUMMARY = "Mono development tools"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. This package contains compilers and \
other tools needed to develop .NET applications. \
 \
Mono development tools."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "mono-devel-6.12.0-5.4.aarch64.rpm"
RPM_HASH = "07b60562e02a51f5bc1eb8deb902e4edeb1223b53468d99171b7ce76a86751a33e39bde43f62a0929c8d7ca507ee79bb14c3b635fc4c7dbdaa9296ff9232a20d"

RPROVIDES:${PN} += "libmono-profiler-aot.so.0 \
libmono-profiler-coverage.so.0 \
libmono-profiler-log.so.0 \
mono-Microsoft.Build \
mono-Microsoft.Build.Engine \
mono-Microsoft.Build.Framework \
mono-Microsoft.Build.Tasks.Core \
mono-Microsoft.Build.Tasks.v12.0 \
mono-Microsoft.Build.Tasks.v4.0 \
mono-Microsoft.Build.Utilities.Core \
mono-Microsoft.Build.Utilities.v12.0 \
mono-Microsoft.Build.Utilities.v4.0 \
mono-Microsoft.Win32.Primitives \
mono-Mono.CodeContracts \
mono-Mono.Debugger.Soft \
mono-Mono.Posix \
mono-Mono.XBuild.Tasks \
mono-PEAPI \
mono-System.AppContext \
mono-System.Collections \
mono-System.Collections.Concurrent \
mono-System.Collections.NonGeneric \
mono-System.Collections.Specialized \
mono-System.ComponentModel \
mono-System.ComponentModel.Annotations \
mono-System.ComponentModel.EventBasedAsync \
mono-System.ComponentModel.Primitives \
mono-System.ComponentModel.TypeConverter \
mono-System.Configuration.Install \
mono-System.Console \
mono-System.Core \
mono-System.Data.Common \
mono-System.Diagnostics.Contracts \
mono-System.Diagnostics.Debug \
mono-System.Diagnostics.FileVersionInfo \
mono-System.Diagnostics.Process \
mono-System.Diagnostics.StackTrace \
mono-System.Diagnostics.TextWriterTraceListener \
mono-System.Diagnostics.Tools \
mono-System.Diagnostics.TraceSource \
mono-System.Diagnostics.Tracing \
mono-System.Drawing.Primitives \
mono-System.Dynamic.Runtime \
mono-System.Globalization \
mono-System.Globalization.Calendars \
mono-System.Globalization.Extensions \
mono-System.IO \
mono-System.IO.Compression.ZipFile \
mono-System.IO.FileSystem \
mono-System.IO.FileSystem.DriveInfo \
mono-System.IO.FileSystem.Primitives \
mono-System.IO.FileSystem.Watcher \
mono-System.IO.IsolatedStorage \
mono-System.IO.MemoryMappedFiles \
mono-System.IO.Pipes \
mono-System.IO.UnmanagedMemoryStream \
mono-System.Linq \
mono-System.Linq.Expressions \
mono-System.Linq.Parallel \
mono-System.Linq.Queryable \
mono-System.Net.Http.Rtc \
mono-System.Net.NameResolution \
mono-System.Net.NetworkInformation \
mono-System.Net.Ping \
mono-System.Net.Primitives \
mono-System.Net.Requests \
mono-System.Net.Security \
mono-System.Net.Sockets \
mono-System.Net.WebHeaderCollection \
mono-System.Net.WebSockets \
mono-System.Net.WebSockets.Client \
mono-System.ObjectModel \
mono-System.Reflection \
mono-System.Reflection.Emit \
mono-System.Reflection.Emit.ILGeneration \
mono-System.Reflection.Emit.Lightweight \
mono-System.Reflection.Extensions \
mono-System.Reflection.Primitives \
mono-System.Resources.Reader \
mono-System.Resources.ResourceManager \
mono-System.Resources.Writer \
mono-System.Runtime \
mono-System.Runtime.CompilerServices.VisualC \
mono-System.Runtime.Extensions \
mono-System.Runtime.Handles \
mono-System.Runtime.InteropServices \
mono-System.Runtime.InteropServices.RuntimeInformation \
mono-System.Runtime.InteropServices.WindowsRuntime \
mono-System.Runtime.Numerics \
mono-System.Runtime.Serialization.Formatters \
mono-System.Runtime.Serialization.Json \
mono-System.Runtime.Serialization.Primitives \
mono-System.Runtime.Serialization.Xml \
mono-System.Security.Claims \
mono-System.Security.Cryptography.Algorithms \
mono-System.Security.Cryptography.Csp \
mono-System.Security.Cryptography.Encoding \
mono-System.Security.Cryptography.Primitives \
mono-System.Security.Cryptography.X509Certificates \
mono-System.Security.Principal \
mono-System.Security.SecureString \
mono-System.ServiceModel \
mono-System.ServiceModel.Duplex \
mono-System.ServiceModel.Http \
mono-System.ServiceModel.NetTcp \
mono-System.ServiceModel.Primitives \
mono-System.ServiceModel.Security \
mono-System.Text.Encoding \
mono-System.Text.Encoding.Extensions \
mono-System.Text.RegularExpressions \
mono-System.Threading \
mono-System.Threading.Overlapped \
mono-System.Threading.Tasks \
mono-System.Threading.Tasks.Parallel \
mono-System.Threading.Thread \
mono-System.Threading.ThreadPool \
mono-System.Threading.Timer \
mono-System.Transactions \
mono-System.ValueTuple \
mono-System.Xml.ReaderWriter \
mono-System.Xml.XDocument \
mono-System.Xml.XPath \
mono-System.Xml.XPath.XDocument \
mono-System.Xml.XmlDocument \
mono-System.Xml.XmlSerializer \
mono-aprofutil \
mono-caspol \
mono-cccheck \
mono-ccrewrite \
mono-cert2spc \
mono-devel \
mono-dtd2rng \
mono-dtd2xsd \
mono-genxs \
mono-httpcfg \
mono-ictool \
mono-ilasm \
mono-illinkanalyzer \
mono-installvst \
mono-lc \
mono-macpack \
mono-makecert \
mono-mdbrebase \
mono-mkbundle \
mono-mono-api-diff \
mono-mono-api-html \
mono-mono-api-info \
mono-mono-cil-strip \
mono-mono-shlib-cop \
mono-mono-symbolicate \
mono-mono-xmltool \
mono-monolinker \
mono-monop \
mono-netstandard \
mono-pdb2mdb \
mono-permview \
mono-resgen \
mono-secutil \
mono-sgen \
mono-signcode \
mono-xbuild \
pkgconfig-cecil \
pkgconfig-dotnet \
pkgconfig-dotnet35 \
pkgconfig-mono \
pkgconfig-mono-cairo \
pkgconfig-mono-lineeditor \
pkgconfig-mono-options \
pkgconfig-xbuild12"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
/usr/bin/env \
/usr/bin/pkg-config \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdiplus-devel \
libglib-2-0-0 \
libgmodule-2-0-0 \
libm.so.6 \
libz.so.1 \
mono-Mono.Cecil \
mono-Mono.Profiler.Log \
mono-System.Runtime.CompilerServices.Unsafe \
mono-System.Runtime.Serialization \
mono-core \
mono-data \
mono-data-oracle \
mono-extras \
mono-web \
mono-winforms \
pkgconfig"

inherit rpm
