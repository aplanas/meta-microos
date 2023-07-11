SUMMARY = "Convert markdown into man pages"
DESCRIPTION = "Tool to converts markdown into man pages."
LICENSE = "MIT"

PV = "2.0.0+git20190314.f79a8a8"

RPM_NAME = "golang-github-cpuguy83-go-md2man-2.0.0+git20190314.f79a8a8-1.16.aarch64.rpm"
RPM_HASH = "b31526723724deac069ffc855764b8d6acc251a875614ee8de4d3006f4aa68f9562b5d41c61728377e4fec9c72d7d03a31bda79fa7919598cd60e795f13f1249"

RPROVIDES:${PN} += "golang-github-cpuguy83-go-md2man"

RDEPENDS:${PN} += ""

inherit rpm
