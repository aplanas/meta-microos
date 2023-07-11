SUMMARY = "Incredibly simple helpers for testing code with exceptions"
DESCRIPTION = "Test::Fatal is an alternative to the popular Test::Exception. It does much \
less, but should allow greater flexibility in testing exception-throwing \
code with about the same amount of typing. \
 \
It exports one routine by default: 'exception'. \
 \
*Achtung!* 'exception' intentionally does not manipulate the call stack. \
User-written test functions that use 'exception' must be careful to avoid \
false positives if exceptions use stack traces that show arguments. For a \
more magical approach involving globally overriding 'caller', see \
Test::Exception."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.017"

RPM_NAME = "perl-Test-Fatal-0.017-1.3.noarch.rpm"
RPM_HASH = "aee0887a87fd332f2a010e62c8f268ff54a507e15172ca0b685923a8fb8b9af62aa00e5a59a3f3bdbd38bb587e8be838da328f7600acf907df7537b9f591f654"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Fatal \
perl-Test-Fatal"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Try--Tiny"

inherit rpm
