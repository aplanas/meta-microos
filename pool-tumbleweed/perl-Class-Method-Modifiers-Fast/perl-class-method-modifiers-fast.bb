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

RPM_NAME = "perl-Class-Method-Modifiers-Fast-0.041-15.21.noarch.rpm"
RPM_HASH = "41878a8c1d70de06c6bfb4c8dada0169935bb4a838308a92b4622eff1d0dba083d043b7bb59953189a2f1f97acb78f550d9f93bf1b2d0dfbae69f72b50a78fc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Method--Modifiers--Fast \
perl-Class-Method-Modifiers-Fast"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Data--Util"

inherit rpm
