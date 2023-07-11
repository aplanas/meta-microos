SUMMARY = "Perl extension for approximate matching (fuzzy matching)"
DESCRIPTION = "String::Approx lets you match and substitute strings approximately. With \
this you can emulate errors: typing errorrs, speling errors, closely \
related vocabularies (colour color), genetic mutations (GAG ACT), \
abbreviations (McScot, MacScot). \
 \
NOTE: String::Approx suits the task of *string matching*, not *string \
comparison*, and it works for *strings*, not for *text*. \
 \
If you want to compare strings for similarity, you probably just want the \
Levenshtein edit distance (explained below), the Text::Levenshtein and \
Text::LevenshteinXS modules in CPAN. See also Text::WagnerFischer and \
Text::PhraseDistance. (There are functions for this in String::Approx, e.g. \
adist(), but their results sometimes differ from the bare Levenshtein et \
al.) \
 \
If you want to compare things like text or source code, consisting of \
*words* or *tokens* and *phrases* and *sentences*, or *expressions* and \
*statements*, you should probably use some other tool than String::Approx, \
like for example the standard UNIX diff(1) tool, or the Algorithm::Diff \
module from CPAN. \
 \
The measure of *approximateness* is the _Levenshtein edit distance_. It is \
the total number of 'edits': insertions, \
 \
	word world \
 \
deletions, \
 \
	monkey money \
 \
and substitutions \
 \
	sun fun \
 \
required to transform a string to another string. For example, to transform \
_'lead'_ into _'gold'_, you need three edits: \
 \
	lead gead goad gold \
 \
The edit distance of 'lead' and 'gold' is therefore three, or 75%. \
 \
*String::Approx* uses the Levenshtein edit distance as its measure, but \
String::Approx is not well-suited for comparing strings of different \
length, in other words, if you want a 'fuzzy eq', see above. String::Approx \
is more like regular expressions or index(), it finds substrings that are \
close matches.>"
LICENSE = "LGPL-2.0 | Artistic-2.0"

PV = "3.28"

RPM_NAME = "perl-String-Approx-3.28-1.32.aarch64.rpm"
RPM_HASH = "87b2444000bb00698b671f828fbc34619da651e7be9aa7dffa431fbc6dc02a63843ff73e5fbf1025df96ff8795b13755b22fb70af6de7797bdf61e7c9143f739"

RPROVIDES:${PN} += "perl-String--Approx \
perl-String-Approx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
