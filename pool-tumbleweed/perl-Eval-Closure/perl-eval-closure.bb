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

RPM_NAME = "perl-Eval-Closure-0.14-1.25.noarch.rpm"
RPM_HASH = "78e8ae36ba5cffebdcc19a086d84f933a11f7d2e22a05ec06ac510ba533512fcb69e23b06bcdc65ba9a8138fd933d39c8b8337af727d5dba90fb0b79734573ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Eval--Closure \
perl-Eval-Closure"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
