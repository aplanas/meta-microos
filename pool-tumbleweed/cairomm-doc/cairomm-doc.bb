SUMMARY = "Documentation for the Cairo C++ interface"
DESCRIPTION = "This package provides documentation for the Cairo C++ interface."
LICENSE = "LGPL-2.1-or-later"

PV = "1.16.1"

RPM_NAME = "cairomm-doc-1.16.1-2.3.aarch64.rpm"
RPM_HASH = "74c3ca78535f8fec7f90d0e96b88eda1fbf26fc761acd71a91613f0aacc86e226978009d6c073bd15cec00ab4523f2ee05e26309a37bb9356fbe654daeba855f"

RPROVIDES:${PN} += "cairomm-doc"

RDEPENDS:${PN} += ""

inherit rpm
