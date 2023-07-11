SUMMARY = "Header files for the REXX interpreter"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require Regina-REXX."
LICENSE = "GFDL-1.1-only & LGPL-2.1-or-later"

PV = "3.9.1"

RPM_NAME = "Regina-REXX-devel-3.9.1-6.10.aarch64.rpm"
RPM_HASH = "99213971b0ff98c98d4869858dd40abd479f75edc200aacf0a86d6bfe33365fcc8c5e87fed501a32e5ded5c3b16b4dde00b4465e61b495b473c44bb9ed2bfa80"

RPROVIDES:${PN} += "Regina-REXX-devel \
regina-/usr/include/rexxsaa.h \
regina-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
Regina-REXX \
libregina3"

inherit rpm
