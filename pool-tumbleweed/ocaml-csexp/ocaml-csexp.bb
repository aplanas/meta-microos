SUMMARY = "Parsing and printing of S-expressions in Canonical form"
DESCRIPTION = "This library provides minimal support for Canonical S-expressions. Canonical S-expressions are a binary encoding of S-expressions that is super simple and well suited for communication between programs. \
 \
This library only provides a few helpers for simple applications. If you need more advanced support, such as parsing from more fancy input sources, you should consider copying the code of this library given how simple parsing S-expressions in canonical form is. \
 \
To avoid a dependency on a particular S-expression library, the only module of this library is parameterised by the type of S-expressions."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "ocaml-csexp-1.5.2-1.1.aarch64.rpm"
RPM_HASH = "1ff6bf5ac89c1181fef0825824b71fcd4598930d0f14c4ac451c989f166b108b27f1f37d415d13ca2140952b620c08805b66f4e7e4439c0e896403211a85daae"

RPROVIDES:${PN} += "ocaml-csexp \
ocaml-csexp(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
