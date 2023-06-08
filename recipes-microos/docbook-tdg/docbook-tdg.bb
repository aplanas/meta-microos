SUMMARY = "DocBook: The Definitive Guide"
DESCRIPTION = "This book is designed to be the clear, concise, normative reference to \
the DocBook DTD. This book is the official documentation for the \
DocBook DTD.  For printed copies, visit http://docbook.org/tdg/en/. \
 \
'Fairly crude PDF versions' (Norman Walsh) of Part I, Part II, and Part \
III are included in this package."
LICENSE = "GFDL-1.1"

PV = "2.0.6"

RPM_NAME = "docbook-tdg-2.0.6-400.16.noarch.rpm"
RPM_HASH = "f504b1ec6f758b2185843358d5087cd426cca67b6813daf1e8eb5b2090d382ca60577192567789ec0b4288eda34bd46e3376df3886cc3d2548413da02d982ea7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docbook-tdg"
RDEPENDS:${PN} += ""

inherit rpm
