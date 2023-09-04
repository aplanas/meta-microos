SUMMARY = "Run code after a subroutine call, preserving the context the subroutine [cut]"
DESCRIPTION = "Sometimes you need to call a function, get the results, act on the results, \
then return the result of the function. This is painful because of \
contexts; the original function can behave different if it's called in \
void, scalar, or list context. You can ignore the various cases and just \
pick one, but that's fragile. To do things right, you need to see which \
case you're being called in, and then call the function in that context. \
This results in 3 code paths, which is a pain to type in (and maintain). \
 \
This module automates the process. You provide a coderef that is the \
'original function', and another coderef to run after the original runs. \
You can modify the return value (aliased to @_) here, and do whatever else \
you need to do. 'wantarray' is correct inside both coderefs; in 'after', \
though, the return value is ignored and the value 'wantarray' returns is \
related to the context that the original function was called in."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.03"

RPM_NAME = "perl-Context-Preserve-0.03-1.22.noarch.rpm"
RPM_HASH = "acf81ed28bc2392d6ae2c2daa1d51900d0cd8208c2a1face41b22eb3df210dc27d109a60cc6fbb0f65ba72b862b156ae792fa6e34af7a22041d1daecabce517c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Context--Preserve \
perl-Context-Preserve"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
