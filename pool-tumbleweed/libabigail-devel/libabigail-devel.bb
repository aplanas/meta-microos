SUMMARY = "Development files for the ABI-relevant artifact library"
DESCRIPTION = "ABIGAIL constructs, manipulates, (de-)serializes ABI-relevant \
artifacts, such as types, variable, fonctions and declarations \
(collectively, the ABI corpus) of a given library or program. The \
library provides a way to compare two ABI corpuses, provide detailed \
information about their differences. \
 \
This subpackage contains the files needed to build programs with ABIGAIL."
LICENSE = "LGPL-3.0-or-later"

PV = "2.0"

RPM_NAME = "libabigail-devel-2.0-1.7.aarch64.rpm"
RPM_HASH = "f43f05fe22a37d7d646efe07727947e06236aadfcfc580e73efba0a68bc154a231f714ed7f98b89d05f8af9a6371c8ac4ec5528f828996197d240885836acfcf"

RPROVIDES:${PN} += "libabigail-devel \
pkgconfig-libabigail"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libabigail0 \
pkgconfig-libxml-2.0"

inherit rpm
