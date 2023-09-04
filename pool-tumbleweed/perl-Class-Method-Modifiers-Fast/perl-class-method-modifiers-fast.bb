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

RPM_NAME = "perl-Class-Method-Modifiers-Fast-0.041-15.22.noarch.rpm"
RPM_HASH = "658950062a79a685a9c4d68ca54db3f96103a340eaa12a6e8da0239cfe129abc2cfa531ff2d704c925f6df7f7637bb52bbba7920b80612ec4ba74d683177ee70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Method--Modifiers--Fast \
perl-Class-Method-Modifiers-Fast"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Data--Util"

inherit rpm
