SUMMARY = "A switch statement for Perl, do not use if you can use given/when"
DESCRIPTION = "The Switch.pm module implements a generalized case mechanism that covers \
most (but not all) of the numerous possible combinations of switch and case \
values described above. \
 \
The module augments the standard Perl syntax with two new control \
statements: 'switch' and 'case'. The 'switch' statement takes a single \
scalar argument of any type, specified in parentheses. 'switch' stores this \
value as the current switch value in a (localized) control variable. The \
value is followed by a block which may contain one or more Perl statements \
(including the 'case' statement described below). The block is \
unconditionally executed once the switch value has been cached. \
 \
A 'case' statement takes a single scalar argument (in mandatory parentheses \
if it's a variable; otherwise the parens are optional) and selects the \
appropriate type of matching between that argument and the current switch \
value. The type of matching used is determined by the respective types of \
the switch value and the 'case' argument, as specified in Table 1. If the \
match is successful, the mandatory block associated with the 'case' \
statement is executed. \
 \
In most other respects, the 'case' statement is semantically identical to \
an 'if' statement. For example, it can be followed by an 'else' clause, and \
can be used as a postfix statement qualifier. \
 \
However, when a 'case' block has been executed control is automatically \
transferred to the statement after the immediately enclosing 'switch' \
block, rather than to the next statement within the block. In other words, \
the success of any 'case' statement prevents other cases in the same scope \
from executing. But see the 'Allowing fall-through' manpage below. \
 \
Together these two new statements provide a fully generalized case \
mechanism: \
 \
        use Switch; \
 \
         \
 \
        %special = ( woohoo => 1,  d'oh => 1 ); \
 \
        while (<>) { \
	    chomp; \
            switch ($_) { \
                case (%special) { print 'homer\\n'; }      # if $special{$_} \
                case /[a-z]/i   { print 'alpha\\n'; }      # if $_ =~ /a-z/i \
                case [1..9]     { print 'small num\\n'; }  # if $_ in [1..9] \
                case { $_[0] >= 10 } { print 'big num\\n'; } # if $_ >= 10 \
                print 'must be punctuation\\n' case /\\W/;  # if $_ ~= /\\W/ \
	    } \
        } \
 \
Note that 'switch'es can be nested within 'case' (or any other) blocks, and \
a series of 'case' statements can try different types of matches -- hash \
membership, pattern match, array intersection, simple equality, etc. -- \
against the same switch value. \
 \
The use of intersection tests against an array reference is particularly \
useful for aggregating integral cases: \
 \
        sub classify_digit \
        { \
                switch ($_[0]) { case 0            { return 'zero' } \
                                 case [2,4,6,8]    { return 'even' } \
                                 case [1,3,5,7,9]  { return 'odd' } \
                                 case /[A-F]/i     { return 'hex' } \
                               } \
        }"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.17"

RPM_NAME = "perl-Switch-2.17-1.29.noarch.rpm"
RPM_HASH = "cc79c97b4207829c0396b4a6889f2e840d10e9256d417094b9c695df6918d8a1ddeb7b9f6632addf98fd80d01e3c3738393248905888d284366de669b29b331b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Switch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Text--Balanced"

inherit rpm
