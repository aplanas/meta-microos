SUMMARY = "OCAML bindings for libhivex"
DESCRIPTION = "This subpackage contains the OCAML bindings for hivex. \
Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "ocaml-hivex-1.3.23-2.5.aarch64.rpm"
RPM_HASH = "18c061f56c1297a9b85d6feca8a3bdceb6c12540c4add5541ec205330ac2a6dff103c0974daed31a6abe6a38f5da9a4526c03ef0cfac4ba24289a1061d75ddef"

RPROVIDES:${PN} += "ocaml-hivex"

RDEPENDS:${PN} += ""

inherit rpm
