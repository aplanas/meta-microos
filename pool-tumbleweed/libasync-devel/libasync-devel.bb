SUMMARY = "SvxLink Async development files"
DESCRIPTION = "The Async library development files"
LICENSE = "GPL-2.0-only"

PV = "1.4.0"

RPM_NAME = "libasync-devel-1.4.0-5.9.aarch64.rpm"
RPM_HASH = "3b399707bda40c131c373c5a74cd4886328597a11f046c04e7a8a6baff7f17653f760d24557f4ace8538344652b5da61615dc0da5e3e5bc87db8414ca91e2b40"

RPROVIDES:${PN} += "libasync-devel"

RDEPENDS:${PN} += "libasync1-6"

inherit rpm
