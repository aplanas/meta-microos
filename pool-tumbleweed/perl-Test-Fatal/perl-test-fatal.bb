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

RPM_NAME = "perl-Test-Fatal-0.017-1.4.noarch.rpm"
RPM_HASH = "08898083ce0fbff0a6e248b81bb6493864361351f2657bff220a9f8cf83fb24c42d2066e958ad97bd0a03791c260493c4422dc9a51341bd7e126e538759abecf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Fatal \
perl-Test-Fatal"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Try--Tiny"

inherit rpm
