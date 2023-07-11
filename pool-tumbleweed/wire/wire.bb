SUMMARY = "Compile-time Dependency Injection for Go"
DESCRIPTION = "Wire is a code generation tool that automates connecting components using \
dependency injection. Dependencies between components are represented in Wire \
as function parameters, encouraging explicit initialization instead of global \
variables. Because Wire operates without runtime state or reflection, code \
written to be used with Wire is useful even for hand-written initialization."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "wire-0.5.0-10.3.aarch64.rpm"
RPM_HASH = "2dfa0f293366f2f6f70cd5ca3b32a8f64c98696785a4aac6f3685f6d20a0bd0028312e0761de4c96b817f274ccb59dd5317c45d6e71927c05157569ea2cc3308"

RPROVIDES:${PN} += "wire"

RDEPENDS:${PN} += ""

inherit rpm
