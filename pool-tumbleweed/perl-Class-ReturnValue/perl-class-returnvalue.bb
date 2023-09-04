SUMMARY = "Return-Value Object That Lets You Treat It"
DESCRIPTION = "Class::ReturnValue is a 'clever' return value object that can allow code \
calling your routine to expect: a boolean value (did it fail) or a list \
(what are the return values)"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.55"

RPM_NAME = "perl-Class-ReturnValue-0.55-15.22.noarch.rpm"
RPM_HASH = "14dbf8325cc84d18ff67c79a4e1e00dafefafcff67ae36119c02d832838decfeba6230f1f0b559824fdc292d6f3a6d3872c66139c4fbcb12e8c01a19384add63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--ReturnValue \
perl-Class-ReturnValue"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Devel--StackTrace"

inherit rpm
