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

RPM_NAME = "perl-Test-Taint-1.08-1.21.aarch64.rpm"
RPM_HASH = "26f58a9c7ca4c42a40aaa38c831031cee214f77e8f3ed0de7147d9ba77c0ec88a0963f08a019d3fe970d3a454c1fb653d47f41165b839e1a4abc53c97624b2c4"

RPROVIDES:${PN} += "perl-Test--Taint \
perl-Test-Taint"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
