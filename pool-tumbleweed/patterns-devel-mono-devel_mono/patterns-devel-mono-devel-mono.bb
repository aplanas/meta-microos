SUMMARY = ".NET Development"
DESCRIPTION = "Tools and libraries for .NET development using Mono."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-mono-devel_mono-20170319-1.15.aarch64.rpm"
RPM_HASH = "b0ae3615ea107adde43fa6d7709790db0b913f175fbe62d05419b5c029b54dc6366b5a48f736c5efcd7b1671cca926d759249c0bb052e4b5daf14301dd7884cc"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-devel-mono-devel_mono \
patterns-devel-mono-devel_mono(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
