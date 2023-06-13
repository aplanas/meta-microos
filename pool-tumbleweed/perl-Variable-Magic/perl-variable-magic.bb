SUMMARY = "Associate user-defined magic to variables from Perl"
DESCRIPTION = "Magic is Perl's way of enhancing variables. This mechanism lets the user \
add extra data to any variable and hook syntactical operations (such as \
access, assignment or destruction) that can be applied to it. With this \
module, you can add your own magic to any variable without having to write \
a single line of XS. \
 \
You'll realize that these magic variables look a lot like tied variables. \
It is not surprising, as tied variables are implemented as a special kind \
of magic, just like any 'irregular' Perl variable : scalars like '$!', '$(' \
or '$^W', the '%ENV' and '%SIG' hashes, the '@ISA' array, 'vec()' and \
'substr()' lvalues, threads::shared variables... They all share the same \
underlying C API, and this module gives you direct access to it."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.63"

RPM_NAME = "perl-Variable-Magic-0.63-1.2.aarch64.rpm"
RPM_HASH = "6fdaa966f1358023fba711157264f9e585d1cfbdac239ad2e159173b120108ce58a6ccee255afe763523180140e2714fc1048df1811eaa633eba6bd854350223"

RPROVIDES:${PN} += "perl(Variable::Magic) \
perl-Variable-Magic \
perl-Variable-Magic(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
