SUMMARY = "Powerfully simple build configuration"
DESCRIPTION = "Premake is a build configuration tool. Describe your C, C++, or C# software project \
using a simple, easy to read syntax and let Premake generate the project files for: \
 * Microsoft Visual Studio including the Express editions \
 * GNU Make, including Cygwin and MinGW \
 * Apple Xcode \
 * Code::Blocks \
 * CodeLite \
 * IC#Code SharpDevelop \
 * MonoDevelop"
LICENSE = "BSD-3-Clause"

PV = "4.4beta4"

RPM_NAME = "premake4-4.4beta4-6.21.aarch64.rpm"
RPM_HASH = "989ca77c410519c714d5db612eb7f0942cf2caf775d7fc0548ec977a34f70a4f40246cd475195224eec79d8676e2c1785d7285977d5e0deecf441b75acd657e6"

RPROVIDES:${PN} += "premake4 \
premake4(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblua5.1.so.5()(64bit)"

inherit rpm
