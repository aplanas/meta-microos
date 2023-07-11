SUMMARY = "Tool to converts markdown into man pages"
DESCRIPTION = "Tool to converts markdown into man pages."
LICENSE = "MIT"

PV = "2.0.0+git20190314.f79a8a8"

RPM_NAME = "go-md2man-2.0.0+git20190314.f79a8a8-1.16.aarch64.rpm"
RPM_HASH = "b51300c77ab09141b810f0cbb1d0e7f6574d9443fd5c0eda497d9b3003203bc834ba58272de47c758dcbc3b648523a85bd72bc572992495ff27bf9d33f10aef3"

RPROVIDES:${PN} += "go-go-md2man \
go-md2man"

RDEPENDS:${PN} += ""

inherit rpm
