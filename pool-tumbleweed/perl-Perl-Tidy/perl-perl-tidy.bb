SUMMARY = "Indent and reformat perl scripts"
DESCRIPTION = "This module makes the functionality of the perltidy utility available to \
perl scripts. Any or all of the input parameters may be omitted, in which \
case the @ARGV array will be used to provide input parameters as described \
in the perltidy(1) man page. \
 \
For example, the perltidy script is basically just this: \
 \
    use Perl::Tidy; \
    Perl::Tidy::perltidy(); \
 \
The call to *perltidy* returns a scalar *$error_flag* which is TRUE if an \
error caused premature termination, and FALSE if the process ran to normal \
completion. Additional discuss of errors is contained below in the ERROR \
HANDLING section."
LICENSE = "GPL-2.0-or-later"

PV = "20230701"

RPM_NAME = "perl-Perl-Tidy-20230701-1.2.noarch.rpm"
RPM_HASH = "638a62a2e314c50c38d1fe69df3e19f5f48b162da1c499f32da27388757292bef3b82ae9bda1bac7373cc0dd36a9fb9164c9ec11e4a151650af185e43ffdaeac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Perl--Tidy \
perl-Perl--Tidy--Debugger \
perl-Perl--Tidy--DevNull \
perl-Perl--Tidy--Diagnostics \
perl-Perl--Tidy--FileWriter \
perl-Perl--Tidy--Formatter \
perl-Perl--Tidy--HtmlWriter \
perl-Perl--Tidy--IOScalar \
perl-Perl--Tidy--IOScalarArray \
perl-Perl--Tidy--IndentationItem \
perl-Perl--Tidy--LineBuffer \
perl-Perl--Tidy--LineSink \
perl-Perl--Tidy--LineSource \
perl-Perl--Tidy--Logger \
perl-Perl--Tidy--Tokenizer \
perl-Perl--Tidy--VerticalAligner \
perl-Perl--Tidy--VerticalAligner--Alignment \
perl-Perl--Tidy--VerticalAligner--Line \
perl-Perl-Tidy"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
