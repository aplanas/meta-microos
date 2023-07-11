SUMMARY = "A XML/DOM/XPath/XSLT Implementation for Tcl"
DESCRIPTION = "tDOM combines high performance XML data processing with easy and \
powerful Tcl scripting functionality. tDOM should be one of the fastest \
ways to manipulate XML with a scripting language and uses very few \
memory: for example, the DOM tree of the XML recommendation in XML \
(160K) needs only about 450K of memory."
LICENSE = "MPL-2.0"

PV = "0.9.3"

RPM_NAME = "tdom-0.9.3-1.1.aarch64.rpm"
RPM_HASH = "8c90508a00a61763caf4de2461c7774eeda2e1ab107f654663d4a317914c6e88634406fb35f7286fc0f6c069cbed765d74efebb824e5d50bd6e2af72c394cbaa"

RPROVIDES:${PN} += "libtdom0.9.3.so \
libtnc0.3.0.so \
tdom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1"

inherit rpm
