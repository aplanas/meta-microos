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

RPM_NAME = "ocaml-easy-format-1.3.4-1.4.aarch64.rpm"
RPM_HASH = "1a20c7e23e9586acda20925c772ecc3d062b3bcbcaef28ff210848688e1527e222bffbddef57753ab06d185c4793b0c8bb616f5f03bf5d9ff96c1cd4f8b2359f"

RPROVIDES:${PN} += "ocaml-easy-format \
ocaml-easy-format(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
