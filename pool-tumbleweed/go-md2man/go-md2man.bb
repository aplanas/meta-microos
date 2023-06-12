SUMMARY = "Tool to converts markdown into man pages"
DESCRIPTION = "Tool to converts markdown into man pages."
LICENSE = "MIT"

PV = "2.0.0+git20190314.f79a8a8"

RPM_NAME = "go-md2man-2.0.0+git20190314.f79a8a8-1.15.aarch64.rpm"
RPM_HASH = "151e7723d745b83a54c0bacc20efa3613fa3dc13222de03e88518d0041555c86cb37a00f047740a987da76b64982a0c0e12df305deee8e6c7d12511240a404d0"

RPROVIDES:${PN} += "go-go-md2man \
go-md2man \
go-md2man(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
