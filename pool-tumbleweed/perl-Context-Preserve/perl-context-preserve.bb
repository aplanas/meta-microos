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

RPM_NAME = "perl-Context-Preserve-0.03-1.21.noarch.rpm"
RPM_HASH = "17f16101f0ba1299dea0cd45591ad02f01f7d3276b9bc59614cd0318007c08ba3c81d4a6e4e452a724e29c91eda5d7bb4d264ca1e2b7298cb613a0a99a27f244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Context--Preserve \
perl-Context-Preserve"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
