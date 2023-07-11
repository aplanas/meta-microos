SUMMARY = "Binary files of cjkutils"
DESCRIPTION = "Binary files of cjkutils"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-cjkutils-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "6835a67b98652024faf557d019607f9c870f421fb981803adb50fce82d7ae91636e7bed2081c1d10f4021f97071ea7df219dc079fd9481e1be69fe350a7682e5"

RPROVIDES:${PN} += "texlive-cjkutils-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-cjkutils"

inherit rpm
