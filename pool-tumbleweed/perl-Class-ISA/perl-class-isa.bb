SUMMARY = "report the search path for a class's ISA tree"
DESCRIPTION = "Suppose you have a class (like Food::Fish::Fishstick) that is derived, via \
its @ISA, from one or more superclasses (as Food::Fish::Fishstick is from \
Food::Fish, Life::Fungus, and Chemicals), and some of those superclasses \
may themselves each be derived, via its @ISA, from one or more superclasses \
(as above). \
 \
When, then, you call a method in that class ($fishstick->calories), Perl \
first searches there for that method, but if it's not there, it goes \
searching in its superclasses, and so on, in a depth-first (or maybe \
'height-first' is the word) search. In the above example, it'd first look \
in Food::Fish, then Food, then Matter, then Life::Fungus, then Life, then \
Chemicals. \
 \
This library, Class::ISA, provides functions that return that list -- the \
list (in order) of names of classes Perl would search to find a method, \
with no duplicates."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.36"

RPM_NAME = "perl-Class-ISA-0.36-10.28.noarch.rpm"
RPM_HASH = "2cc8935944a7ab19cf3d7a647e73cbe8abe94de65ace1158a0e1e8d2c5bfa58c1d377244e70032d4993904e4e73d221032376ff4a001dd6f2a71a7b46b413e0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--ISA \
perl-Class-ISA"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
