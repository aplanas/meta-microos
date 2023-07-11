SUMMARY = "Data pretty printing made easy"
DESCRIPTION = "This module offers a high-level and functional interface to the Format module \
of the OCaml standard library. It is a pretty-printing facility, i.e. it takes \
as input some code represented as a tree and formats this code into the most \
visually satisfying result, breaking and indenting lines of code where \
appropriate. \
 \
Input data must be first modelled and converted into a tree using 3 kinds of \
nodes: \
 \
    atoms lists labelled nodes \
 \
Atoms represent any text that is guaranteed to be printed as-is. Lists can \
model any sequence of items such as arrays of data or lists of definitions that \
are labelled with something like 'int main', 'let x =' or 'x:'."
LICENSE = "BSD-3-Clause"

PV = "1.3.4"

RPM_NAME = "ocaml-easy-format-1.3.4-1.5.aarch64.rpm"
RPM_HASH = "41af294f47f54243df297a9d886917d8bb09311e83767bfe0ee1928826e19ff81da8ede7be81081536285384cc67aaeec3e308183b5e1108ec913edf767f76d5"

RPROVIDES:${PN} += "ocaml-easy-format"

RDEPENDS:${PN} += ""

inherit rpm
