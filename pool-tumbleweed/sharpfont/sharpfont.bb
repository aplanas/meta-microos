SUMMARY = "Cross-platform FreeType bindings for .NET"
DESCRIPTION = "SharpFont is a library that provides FreeType bindings for .NET. \
Everything from format-specific APIs to the caching subsystem are included."
LICENSE = "MIT"

PV = "4.0.1"

RPM_NAME = "sharpfont-4.0.1-1.8.noarch.rpm"
RPM_HASH = "08b70386330902fd75c5cb541337cc4312bd042bdd54d9223c3c4365f13cd6776d46da538c6dd153fd2f414172ac802143d9149b2381256aad69f446fbf4fcea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-SharpFont \
sharpfont"

RDEPENDS:${PN} += "mono-System.Core \
mono-System.Drawing \
mono-mscorlib"

inherit rpm
