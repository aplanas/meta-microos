SUMMARY = "Safely and Cleanly Create Closures Via String Eval"
DESCRIPTION = "String eval is often used for dynamic code generation. For instance, \
'Moose' uses it heavily, to generate inlined versions of accessors and \
constructors, which speeds code up at runtime by a significant amount. \
String eval is not without its issues however - it's difficult to control \
the scope it's used in (which determines which variables are in scope \
inside the eval), and it's easy to miss compilation errors, since eval \
catches them and sticks them in $@ instead. \
 \
This module attempts to solve these problems. It provides an 'eval_closure' \
function, which evals a string in a clean environment, other than a fixed \
list of specified variables. Compilation errors are rethrown automatically."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.14"

RPM_NAME = "perl-Eval-Closure-0.14-1.23.noarch.rpm"
RPM_HASH = "af7a396a22dc143e58c16990137ad57af956a677b065473399833a476cda59211aef6bae88f64d4e1d934a212afe04958ae4822311d56ad7a77feb236bca7e3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Eval--Closure \
perl-Eval-Closure"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
