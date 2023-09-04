SUMMARY = "Perl module to use HTML-like templating language"
DESCRIPTION = "This module attempts to make using HTML templates simple and natural. It \
extends standard HTML with a few new HTML-esque tags - '<TMPL_VAR>' \
'<TMPL_LOOP>', '<TMPL_INCLUDE>', '<TMPL_IF>', '<TMPL_ELSE>' and \
'<TMPL_UNLESS>'. The file written with HTML and these new tags is called a \
template. It is usually saved separate from your script - possibly even \
created by someone else! Using this module you fill in the values for the \
variables, loops and branches declared in the template. This allows you to \
separate design - the HTML - from the data, which you generate in the Perl \
script. \
 \
This module is licensed under the same terms as Perl. See the LICENSE \
section below for more details."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.97"

RPM_NAME = "perl-HTML-Template-2.97-1.24.noarch.rpm"
RPM_HASH = "8b9bbb408efa1a9ef6b36a3a1ab3da3711bd49bd0bc332cf2b06a92604a4b7366da49f831f27f186773e8b95a1db3569272b5b502657fd71f5f3ee4e30e1ec0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Template \
perl-HTML--Template--COND \
perl-HTML--Template--DEF \
perl-HTML--Template--ESCAPE \
perl-HTML--Template--FAQ \
perl-HTML--Template--JSESCAPE \
perl-HTML--Template--LOOP \
perl-HTML--Template--NOOP \
perl-HTML--Template--PRINTSCALAR \
perl-HTML--Template--URLESCAPE \
perl-HTML--Template--VAR \
perl-HTML-Template"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-CGI"

inherit rpm
