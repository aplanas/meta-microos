SUMMARY = "Cross-platform FreeType bindings for .NET"
DESCRIPTION = "SharpFont is a library that provides FreeType bindings for .NET. \
Everything from format-specific APIs to the caching subsystem are included."
LICENSE = "MIT"

PV = "4.0.1"

RPM_NAME = "sharpfont-devel-4.0.1-1.8.noarch.rpm"
RPM_HASH = "555cd2d3a116a56715f9ece080e4b300b92aa5f1b2a6159aab6eb18aa7702e92d15edeedd3af8d93114ead78f38a2f64af7e8c901c310a9697fa4182e993650b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig(sharpfont) \
sharpfont-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
sharpfont"

inherit rpm
