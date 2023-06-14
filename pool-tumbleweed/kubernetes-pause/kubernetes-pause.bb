SUMMARY = "A binary reaping children"
DESCRIPTION = "This executable can be used as a minimal init process inside a container."
LICENSE = "Apache-2.0"

PV = "3.2"

RPM_NAME = "kubernetes-pause-3.2-1.13.aarch64.rpm"
RPM_HASH = "775cd557d4b7880a07751171cf17e1a069ddf318de8e635016dd445c51a580d775f5d87e31edc24f61bbd575b7f83b70c5a1836ee67f1611a7848ebeac6ae9a8"

RPROVIDES:${PN} += "kubernetes-pause \
kubic-pause"

RDEPENDS:${PN} += ""

inherit rpm
