SUMMARY = "A XML/DOM/XPath/XSLT Implementation for Tcl"
DESCRIPTION = "tDOM combines high performance XML data processing with easy and \
powerful Tcl scripting functionality. tDOM should be one of the fastest \
ways to manipulate XML with a scripting language and uses very few \
memory: for example, the DOM tree of the XML recommendation in XML \
(160K) needs only about 450K of memory."
LICENSE = "MPL-2.0"

PV = "0.9.2"

RPM_NAME = "tdom-0.9.2-2.3.aarch64.rpm"
RPM_HASH = "da7810e32b3b40d118208b4bf792bfaff45a947d81a7d5d25da1455268ab4f384646ea0ead0511e8a2bca22eacffb5233c20e386d9cf932dcad75aa0e6f07a77"

RPROVIDES:${PN} += "libtdom0.9.2.so()(64bit) \
libtnc0.3.0.so()(64bit) \
tdom \
tdom(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libexpat.so.1()(64bit)"

inherit rpm
