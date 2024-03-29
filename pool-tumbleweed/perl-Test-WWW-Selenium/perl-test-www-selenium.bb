SUMMARY = "Test applications using Selenium Remote Control"
DESCRIPTION = "This module is a the WWW::Selenium manpage subclass providing some methods \
useful for writing tests. For each Selenium command (open, click, type, \
...) there is a corresponding '<command>_ok' method that checks the return \
value (open_ok, click_ok, type_ok). \
 \
For each Selenium getter (get_title, ...) there are four autogenerated \
methods ('<getter>_is', '<getter>_isnt', '<getter>_like', \
'<getter>_unlike') to check the value of the attribute. \
 \
By calling the constructor with 'default_names' set to a true value your \
tests will be given a reasonable name should you choose not to provide one \
of your own. The test name should always be the third argument."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.36"

RPM_NAME = "perl-Test-WWW-Selenium-1.36-3.27.noarch.rpm"
RPM_HASH = "169ce69b9bf9ed7bfb5dc4b563c48dff12ce21269170af95de43ea352a2a70c01e5181926197f0230bcb1abbcd220af75c83350819bade504c5d623953c4f1d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--REPL--Plugin--Selenium \
perl-Test--WWW--Selenium \
perl-Test-WWW-Selenium \
perl-WWW--Selenium \
perl-WWW--Selenium--Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTTP--Headers \
perl-HTTP--Request \
perl-LWP--UserAgent \
perl-URI--Escape \
perl-namespace--clean"

inherit rpm
