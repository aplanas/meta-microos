SUMMARY = "Parsing Expression Grammar (PEG) Template Library"
DESCRIPTION = "The Parsing Expression Grammar Template Library (PEGTL) is a C++11 \
library for creating parsers according to a Parsing Expression \
Grammar (PEG). Grammars are embedded as regular C++ code, and \
consist of template hierarchies of classes. These hierarchies \
naturally correspond to the inductive definition of PEGs. The \
library extends on the subject of PEGs with new expression types, \
actions that can be attached to grammar rules, and mechanisms to \
ensure helpful diagnostics in case of parsing errors."
LICENSE = "MIT"

PV = "3.2.7"

RPM_NAME = "pegtl-devel-3.2.7-1.3.noarch.rpm"
RPM_HASH = "713d04845c2227c2f3071b442049885231a1a6c24e6dba53804237bca3ca3125b8680174d230046c4affdb3a3462576b9e48d74f209fa8f439977a6381da687e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-pegtl \
pegtl-devel"

RDEPENDS:${PN} += ""

inherit rpm
