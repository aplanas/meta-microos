SUMMARY = "Development Files for Musepack"
DESCRIPTION = "This package includes development files for musepack."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & GPL-2.0-or-later & Zlib"

PV = "r475"

RPM_NAME = "musepack-devel-r475-4.12.aarch64.rpm"
RPM_HASH = "9ba8bf8ff7f07d4ddc732fc2c49c3e09ebd39889be996d626723af1a7c9d93e7a0adb566d48925c95b3b7bdc53eb3bd72d893ef304d05f5eed44aed2578bc6ef"

RPROVIDES:${PN} += "musepack-devel"

RDEPENDS:${PN} += "libmpcdec6"

inherit rpm
