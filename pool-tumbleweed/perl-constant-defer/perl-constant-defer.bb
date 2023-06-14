SUMMARY = "Constant Subs with Deferred Value Calculation"
DESCRIPTION = "'constant::defer' creates a subroutine which on the first call runs given \
code to calculate its value, and on any subsequent calls just returns that \
value, like a constant. The value code is discarded once run, allowing it \
to be garbage collected. \
 \
Deferring a calculation is good if it might take a lot of work or produce a \
big result but is only needed sometimes or only well into a program run. If \
it's never needed then the value code never runs. \
 \
A deferred constant is generally not inlined or folded (see the \
perlop/Constant Folding manpage) since it's not a single scalar value. In \
the current implementation a deferred constant becomes a plain constant \
after the first use, so may inline etc in code compiled after that (see the \
/IMPLEMENTATION manpage below). \
 \
See _examples/simple.pl_ in the constant-defer source code for a complete \
sample program."
LICENSE = "GPL-3.0+"

PV = "6"

RPM_NAME = "perl-constant-defer-6-2.26.noarch.rpm"
RPM_HASH = "87299f36c24663cde39f4d06cf6491277adf4b9594acda28d2ae902cd9a48e27dfba1d20b4bf1c9f85a6f4275ee7ee73218cd3c9de2ea776c6fdbf69b4e44af8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-constant--defer \
perl-constant-defer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
