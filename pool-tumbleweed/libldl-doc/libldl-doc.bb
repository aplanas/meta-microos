SUMMARY = "Documentation for libldl"
DESCRIPTION = "Documentation for libldl."
LICENSE = "LGPL-2.1-or-later"

PV = "5.13.0"

RPM_NAME = "libldl-doc-5.13.0-49.2.aarch64.rpm"
RPM_HASH = "358b9ef0edf17db416694970e3c79871bf827fe9727ed7320c102f65d32639fd785eaebd06eb5fc2fc777ebe8a97bf686a14ee73b7287754a14c3405053c566b"

RPROVIDES:${PN} += "libldl-doc"

RDEPENDS:${PN} += ""

inherit rpm
