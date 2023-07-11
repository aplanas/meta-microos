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

RPM_NAME = "perl-Variable-Magic-0.63-1.3.aarch64.rpm"
RPM_HASH = "15b7fcdcc6abb8e881fea1fd97f565151281ffee76c261e3e71a94ea5812082121c1da27ffc076f1009a3de0af3462b04eb55f10409c29aa897c94f51e0385bf"

RPROVIDES:${PN} += "perl-Variable--Magic \
perl-Variable-Magic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
