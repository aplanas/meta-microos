SUMMARY = "Cross-platform, Open Source, .NET development framework"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization."
LICENSE = "LGPL-2.1-only & MIT & MS-PL"

PV = "6.12.0"

RPM_NAME = "mono-core-6.12.0-5.3.aarch64.rpm"
RPM_HASH = "a497c67e0be1ad7466b04f3b697e537c8b82b69d233944b811e658f5bec93cc540de4a2662905e7a428b983e6ffeb125dad104e4bbcf7a06acf1d1a79ef1d7d9"

RPROVIDES:${PN} += "config(mono-core) \
libMonoPosixHelper.so()(64bit) \
libikvm-native.so()(64bit) \
libmono-btls-shared.so()(64bit) \
libmono-native.so.0()(64bit) \
mono \
mono(Commons.Xml.Relaxng) \
mono(CustomMarshalers) \
mono(I18N) \
mono(I18N.West) \
mono(ICSharpCode.SharpZipLib) \
mono(Microsoft.CSharp) \
mono(Microsoft.VisualC) \
mono(Microsoft.Win32.Primitives) \
mono(Microsoft.Win32.Registry) \
mono(Microsoft.Win32.Registry.AccessControl) \
mono(Mono.Btls.Interface) \
mono(Mono.CSharp) \
mono(Mono.Cairo) \
mono(Mono.Cecil) \
mono(Mono.CompilerServices.SymbolWriter) \
mono(Mono.Configuration.Crypto) \
mono(Mono.Management) \
mono(Mono.Parallel) \
mono(Mono.Posix) \
mono(Mono.Profiler.Log) \
mono(Mono.Security) \
mono(Mono.Simd) \
mono(Mono.Tasklets) \
mono(System) \
mono(System.AppContext) \
mono(System.Collections) \
mono(System.Collections.Concurrent) \
mono(System.Collections.NonGeneric) \
mono(System.Collections.Specialized) \
mono(System.ComponentModel) \
mono(System.ComponentModel.Annotations) \
mono(System.ComponentModel.EventBasedAsync) \
mono(System.ComponentModel.Primitives) \
mono(System.ComponentModel.TypeConverter) \
mono(System.Configuration) \
mono(System.Console) \
mono(System.Core) \
mono(System.Data.Common) \
mono(System.Data.SqlClient) \
mono(System.Deployment) \
mono(System.Diagnostics.Contracts) \
mono(System.Diagnostics.Debug) \
mono(System.Diagnostics.FileVersionInfo) \
mono(System.Diagnostics.Process) \
mono(System.Diagnostics.StackTrace) \
mono(System.Diagnostics.TextWriterTraceListener) \
mono(System.Diagnostics.Tools) \
mono(System.Diagnostics.TraceEvent) \
mono(System.Diagnostics.TraceSource) \
mono(System.Diagnostics.Tracing) \
mono(System.Drawing) \
mono(System.Drawing.Primitives) \
mono(System.Dynamic) \
mono(System.Dynamic.Runtime) \
mono(System.Globalization) \
mono(System.Globalization.Calendars) \
mono(System.Globalization.Extensions) \
mono(System.IO) \
mono(System.IO.Compression) \
mono(System.IO.Compression.FileSystem) \
mono(System.IO.Compression.ZipFile) \
mono(System.IO.FileSystem) \
mono(System.IO.FileSystem.AccessControl) \
mono(System.IO.FileSystem.DriveInfo) \
mono(System.IO.FileSystem.Primitives) \
mono(System.IO.FileSystem.Watcher) \
mono(System.IO.IsolatedStorage) \
mono(System.IO.MemoryMappedFiles) \
mono(System.IO.Pipes) \
mono(System.IO.UnmanagedMemoryStream) \
mono(System.Json) \
mono(System.Json.Microsoft) \
mono(System.Linq) \
mono(System.Linq.Expressions) \
mono(System.Linq.Parallel) \
mono(System.Linq.Queryable) \
mono(System.Memory) \
mono(System.Net) \
mono(System.Net.AuthenticationManager) \
mono(System.Net.Cache) \
mono(System.Net.Http) \
mono(System.Net.Http.Formatting) \
mono(System.Net.Http.Rtc) \
mono(System.Net.Http.WebRequest) \
mono(System.Net.HttpListener) \
mono(System.Net.Mail) \
mono(System.Net.NameResolution) \
mono(System.Net.NetworkInformation) \
mono(System.Net.Ping) \
mono(System.Net.Primitives) \
mono(System.Net.Requests) \
mono(System.Net.Security) \
mono(System.Net.ServicePoint) \
mono(System.Net.Sockets) \
mono(System.Net.Utilities) \
mono(System.Net.WebHeaderCollection) \
mono(System.Net.WebSockets) \
mono(System.Net.WebSockets.Client) \
mono(System.Numerics) \
mono(System.Numerics.Vectors) \
mono(System.ObjectModel) \
mono(System.Reflection) \
mono(System.Reflection.Context) \
mono(System.Reflection.Emit) \
mono(System.Reflection.Emit.ILGeneration) \
mono(System.Reflection.Emit.Lightweight) \
mono(System.Reflection.Extensions) \
mono(System.Reflection.Primitives) \
mono(System.Reflection.TypeExtensions) \
mono(System.Resources.Reader) \
mono(System.Resources.ReaderWriter) \
mono(System.Resources.ResourceManager) \
mono(System.Resources.Writer) \
mono(System.Runtime) \
mono(System.Runtime.CompilerServices.Unsafe) \
mono(System.Runtime.CompilerServices.VisualC) \
mono(System.Runtime.Extensions) \
mono(System.Runtime.Handles) \
mono(System.Runtime.InteropServices) \
mono(System.Runtime.InteropServices.RuntimeInformation) \
mono(System.Runtime.InteropServices.WindowsRuntime) \
mono(System.Runtime.Numerics) \
mono(System.Runtime.Serialization.Formatters) \
mono(System.Runtime.Serialization.Json) \
mono(System.Runtime.Serialization.Primitives) \
mono(System.Runtime.Serialization.Xml) \
mono(System.Security) \
mono(System.Security.AccessControl) \
mono(System.Security.Claims) \
mono(System.Security.Cryptography.Algorithms) \
mono(System.Security.Cryptography.Csp) \
mono(System.Security.Cryptography.DeriveBytes) \
mono(System.Security.Cryptography.Encoding) \
mono(System.Security.Cryptography.Encryption) \
mono(System.Security.Cryptography.Encryption.Aes) \
mono(System.Security.Cryptography.Encryption.ECDiffieHellman) \
mono(System.Security.Cryptography.Encryption.ECDsa) \
mono(System.Security.Cryptography.Hashing) \
mono(System.Security.Cryptography.Hashing.Algorithms) \
mono(System.Security.Cryptography.Primitives) \
mono(System.Security.Cryptography.ProtectedData) \
mono(System.Security.Cryptography.RSA) \
mono(System.Security.Cryptography.RandomNumberGenerator) \
mono(System.Security.Cryptography.X509Certificates) \
mono(System.Security.Principal) \
mono(System.Security.Principal.Windows) \
mono(System.Security.SecureString) \
mono(System.Text.Encoding) \
mono(System.Text.Encoding.CodePages) \
mono(System.Text.Encoding.Extensions) \
mono(System.Text.RegularExpressions) \
mono(System.Threading) \
mono(System.Threading.AccessControl) \
mono(System.Threading.Overlapped) \
mono(System.Threading.Tasks) \
mono(System.Threading.Tasks.Dataflow) \
mono(System.Threading.Tasks.Extensions) \
mono(System.Threading.Tasks.Parallel) \
mono(System.Threading.Thread) \
mono(System.Threading.ThreadPool) \
mono(System.Threading.Timer) \
mono(System.ValueTuple) \
mono(System.Web.Mobile) \
mono(System.Web.RegularExpressions) \
mono(System.Windows) \
mono(System.Workflow.Activities) \
mono(System.Workflow.ComponentModel) \
mono(System.Workflow.Runtime) \
mono(System.Xml) \
mono(System.Xml.Linq) \
mono(System.Xml.ReaderWriter) \
mono(System.Xml.Serialization) \
mono(System.Xml.XDocument) \
mono(System.Xml.XPath) \
mono(System.Xml.XPath.XDocument) \
mono(System.Xml.XmlDocument) \
mono(System.Xml.XmlSerializer) \
mono(System.Xml.Xsl.Primitives) \
mono(al) \
mono(cert-sync) \
mono(certmgr) \
mono(chktrust) \
mono(crlupdate) \
mono(cscompmgd) \
mono(csharp) \
mono(gacutil) \
mono(ikdasm) \
mono(mcs) \
mono(mono-configuration-crypto) \
mono(mozroots) \
mono(mscorlib) \
mono(netstandard) \
mono(setreg) \
mono(sn) \
mono-cairo \
mono-core \
mono-core(aarch-64) \
mono-drawing \
mono-ikvm \
mono-posix \
mono-xml-relaxng \
mono-ziplib"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
ca-certificates \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libz.so.1()(64bit) \
mono(System.ComponentModel.Composition) \
mono(System.ComponentModel.DataAnnotations) \
mono(System.Data) \
mono(System.Data.DataSetExtensions) \
mono(System.Runtime.Serialization) \
mono(System.ServiceModel) \
mono(System.Transactions) \
mono(System.Web) \
timezone"

inherit rpm