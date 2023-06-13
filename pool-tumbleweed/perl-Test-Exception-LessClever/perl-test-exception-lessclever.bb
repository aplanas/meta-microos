SUMMARY = "(DEPRECATED) Test::Exception simplified"
DESCRIPTION = "(DEPRECATED) Test::Exception simplified"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.009"

RPM_NAME = "perl-Test-Exception-LessClever-0.009-1.24.noarch.rpm"
RPM_HASH = "c5a54cbc0fad8b23bee58a67176db13a6e95094cc09fae131b64b945f7425e23514f46a9687c6733f3ae3b6bf25c09b43b8a12ba2a8e9193271c32440bf8effb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Exception::LessClever) \
perl-Test-Exception-LessClever"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
