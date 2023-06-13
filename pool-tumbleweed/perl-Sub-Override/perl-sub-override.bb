SUMMARY = "Perl extension for easily overriding subroutines"
DESCRIPTION = "Perl extension for easily overriding subroutines"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.09"

RPM_NAME = "perl-Sub-Override-0.09-5.27.noarch.rpm"
RPM_HASH = "76a65a1cf5fcc9177ce9b74ea2c152266a7df5286ed2a40fb5f4da3b49501a0453201b2270cf5718d4c219c56cc7004219377c0033fed3c2b8a2f1d003bd412d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Sub::Override) \
perl-Sub-Override"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Test::Fatal)"

inherit rpm
