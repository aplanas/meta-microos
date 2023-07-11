SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-doc-13.0.1-10.1.noarch.rpm"
RPM_HASH = "adc569076d229afd6fdd1236307bcd188ddddd33951d2a0a8539da8e4c15cceea653bc0e6e581176c23ad2efd1cef45bf0391344ad52b5fc44a18dc0b6a873c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider \
llvm13-doc"

RDEPENDS:${PN} += "llvm13"

inherit rpm
