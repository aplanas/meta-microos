SUMMARY = "Parsing and printing of S-expressions in Canonical form"
DESCRIPTION = "This library provides minimal support for Canonical S-expressions. Canonical S-expressions are a binary encoding of S-expressions that is super simple and well suited for communication between programs. \
 \
This library only provides a few helpers for simple applications. If you need more advanced support, such as parsing from more fancy input sources, you should consider copying the code of this library given how simple parsing S-expressions in canonical form is. \
 \
To avoid a dependency on a particular S-expression library, the only module of this library is parameterised by the type of S-expressions."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "ocaml-csexp-1.5.2-1.2.aarch64.rpm"
RPM_HASH = "8fb54863e048fc339d5cde9483ee1cc31288490b32480bf6adb6b52c065683241cb5a420a2f56766d596d2f70da2750461101ca6d963c06dd25530fd4a8621eb"

RPROVIDES:${PN} += "ocaml-csexp"

RDEPENDS:${PN} += ""

inherit rpm
