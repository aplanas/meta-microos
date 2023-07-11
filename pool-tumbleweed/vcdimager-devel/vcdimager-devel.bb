SUMMARY = "Video CD (VCD) authoring software"
DESCRIPTION = "GNU VCDImager is a full-featured mastering suite for authoring, \
disassembling and analyzing Video CDs and Super Video CDs."
LICENSE = "GPL-2.0-only"

PV = "2.0.1"

RPM_NAME = "vcdimager-devel-2.0.1-3.12.aarch64.rpm"
RPM_HASH = "ef8f1f4cfb47469f7dbbbff0f0df78643fb1f7177ba5617f376481e893f0b900bde3b909fe99d00c56d0df84cb3f3cbe74a83ce42a6783e2e0da90c499a3343b"

RPROVIDES:${PN} += "pkgconfig-libvcdinfo \
vcdimager-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvcdinfo0 \
pkgconfig-libcdio"

inherit rpm
