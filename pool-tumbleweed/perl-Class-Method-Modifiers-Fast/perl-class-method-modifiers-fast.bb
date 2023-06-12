SUMMARY = "Provides Moose-Like Method Modifiers"
DESCRIPTION = "Method modifiers are a powerful feature from the CLOS (Common Lisp Object \
System) world. \
 \
'Class::Method::Modifiers::Fast' provides three modifiers: 'before', \
'around', and 'after'. 'before' and 'after' are run just before and after \
the method they modify, but can not really affect that original method. \
'around' is run in place of the original method, with a hook to easily call \
that original method. See the 'MODIFIERS' section for more details on how \
the particular modifiers work."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.041"

RPM_NAME = "perl-Class-Method-Modifiers-Fast-0.041-15.20.noarch.rpm"
RPM_HASH = "5209071b0005647e63a21e404b6a437dc31d7fc934d554f2c898fd9f6727f1cf96cc11c8784524ec28fdbadd39672f675b67dc5372d4587ebb22109941c59b70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Class::Method::Modifiers::Fast) \
perl-Class-Method-Modifiers-Fast"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Data::Util)"

inherit rpm
