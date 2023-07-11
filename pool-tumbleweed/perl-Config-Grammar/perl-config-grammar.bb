SUMMARY = "Grammar-based, user-friendly config parser"
DESCRIPTION = "Config::Grammar is a module to parse configuration files. The optional \
second parameter to the parse() method can be used to specify the file \
encoding to use for opening the file (see documentation for Perl's use open \
pragma). \
 \
The configuration may consist of multiple-level sections with assignments \
and tabular data. The parsed data will be returned as a hash containing the \
whole configuration. Config::Grammar uses a grammar that is supplied upon \
creation of a Config::Grammar object to parse the configuration file and \
return helpful error messages in case of syntax errors. Using the *makepod* \
method you can generate documentation of the configuration file format. \
 \
The *maketmpl* method can generate a template configuration file. If your \
grammar contains regexp matches, the template will not be all that helpful \
as Config::Grammar is not smart enough to give you sensible template data \
based in regular expressions. The related function *maketmplmin* generates \
a minimal configuration template without examples, regexps or comments and \
thus allows an experienced user to fill in the configuration data more \
efficiently."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.13"

RPM_NAME = "perl-Config-Grammar-1.13-1.16.noarch.rpm"
RPM_HASH = "a9b9172e8a70be0f3f654437aecead19c1ddcc61e31513f172d6efe4e8f71c767f846469df217217f97bf141a72fa5656561b2f75e060dfa930918eb2b49a920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--Grammar \
perl-Config--Grammar--Document \
perl-Config--Grammar--Dynamic \
perl-Config-Grammar"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
