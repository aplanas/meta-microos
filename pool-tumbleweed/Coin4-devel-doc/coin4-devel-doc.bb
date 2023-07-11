SUMMARY = "Development documentation for Coin"
DESCRIPTION = "Coin is a scene-graph based, retain-mode, rendering and model \
manipulation C++ class library. \
 \
This package contains the API and other development documentation."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "Coin4-devel-doc-4.0.0-1.8.aarch64.rpm"
RPM_HASH = "41540be9e55d513aa213a7f3daac736d9ac381df3c8d47d4bcb298763d700a2bb5889efc8ea35750c571a21550d7312d14e8310c20136165289348064990dd69"

RPROVIDES:${PN} += "Coin4-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
