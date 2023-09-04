SUMMARY = "Tools to test taintedness"
DESCRIPTION = "Tainted data is data that comes from an unsafe source, such as the command \
line, or, in the case of web apps, any GET or POST transactions. Read the \
perlsec man page for details on why tainted data is bad, and how to untaint \
the data. \
 \
When you're writing unit tests for code that deals with tainted data, \
you'll want to have a way to provide tainted data for your routines to \
handle, and easy ways to check and report on the taintedness of your data, \
in standard Test::More style."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.08"

RPM_NAME = "perl-Test-Taint-1.08-1.22.aarch64.rpm"
RPM_HASH = "3e8c9f7e89529c5f0a0e3ac1b1286c113be0707a0d6126b45a4d19534f507d7a33ae0f270fc710f20eef419dfbf098c49b0e44caf71d5600239e4e8bce50be13"

RPROVIDES:${PN} += "perl-Test--Taint \
perl-Test-Taint"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
