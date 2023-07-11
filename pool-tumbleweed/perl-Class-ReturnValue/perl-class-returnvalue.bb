SUMMARY = "Return-Value Object That Lets You Treat It"
DESCRIPTION = "Class::ReturnValue is a 'clever' return value object that can allow code \
calling your routine to expect: a boolean value (did it fail) or a list \
(what are the return values)"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.55"

RPM_NAME = "perl-Class-ReturnValue-0.55-15.21.noarch.rpm"
RPM_HASH = "237e9f914a1d323b95dc04b4e6e20511c5a23d94035cb602ad736fd4ddf509dee736c524c6c190eaf8ee46f50091836ae2ac11a828640dc8119fdf127e24b415"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--ReturnValue \
perl-Class-ReturnValue"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Devel--StackTrace"

inherit rpm
