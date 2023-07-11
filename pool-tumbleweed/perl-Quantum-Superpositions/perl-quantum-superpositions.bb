SUMMARY = "QM-like superpositions in Perl"
DESCRIPTION = "The Quantum::Superpositions module adds two new operators to Perl: 'any' \
and 'all'. \
 \
Each of these operators takes a list of values (states) and superimposes \
them into a single scalar value (a superposition), which can then be stored \
in a standard scalar variable. \
 \
The 'any' and 'all' operators produce two distinct kinds of superposition. \
The 'any' operator produces a disjunctive superposition, which may \
(notionally) be in any one of its states at any time, according to the \
needs of the algorithm that uses it. \
 \
In contrast, the 'all' operator creates a conjunctive superposition, which \
is always in every one of its states simultaneously. \
 \
Superpositions are scalar values and hence can participate in arithmetic \
and logical operations just like any other type of scalar. However, when an \
operation is applied to a superposition, it is applied (notionally) in \
parallel to each of the states in that superposition. \
 \
For example, if a superposition of states 1, 2, and 3 is multiplied by 2: \
 \
	$result = any(1,2,3) * 2; \
 \
the result is a superposition of states 2, 4, and 6. If that result is then \
compared with the value 4: \
 \
	if ($result == 4) { print 'fore!' } \
 \
then the comparison also returns a superposition: one that is both true and \
false (since the equality is true for one of the states of '$result' and \
false for the other two). \
 \
Of course, a value that is both true and false is of no use in an 'if' \
statement, so some mechanism is needed to decide which superimposed boolean \
state should take precedence. \
 \
This mechanism is provided by the two types of superposition available. A \
disjunctive superposition is true if any of its states is true, whereas a \
conjunctive superposition is true only if all of its states are true. \
 \
Thus the previous example does print 'fore!', since the 'if' condition is \
equivalent to: \
 \
	if (any(2,4,6) == 4)... \
 \
It suffices that any one of 2, 4, or 6 is equal to 4, so the condition is \
true and the 'if' block executes. \
 \
On the other hand, had the control statement been: \
 \
        if (all(2,4,6) == 4)... \
 \
the condition would fail, since it is not true that all of 2, 4, and 6 are \
equal to 4. \
 \
Operations are also possible between two superpositions: \
 \
        if (all(1,2,3)*any(5,6) < 21) \
                { print 'no alcohol'; } \
 \
        if (all(1,2,3)*any(5,6) < 18) \
                { print 'no entry'; } \
 \
        if (any(1,2,3)*all(5,6) < 18) \
                { print 'under-age' } \
 \
In this example, the string 'no alcohol' is printed because the \
superposition produced by the multiplication is the Cartesian product of \
the respective states of the two operands: 'all(5,6,10,12,15,18)'. Since \
all of these resultant states are less that 21, the condition is true. In \
contrast, the string 'no entry' is not printed, because not all the \
product's states are less than 18. \
 \
Note that the type of the first operand determines the type of the result \
of an operation. Hence the third string -- 'underage' -- is printed, \
because multiplying a disjunctive superposition by a conjunctive \
superposition produces a result that is disjunctive: \
'any(5,6,10,12,15,18)'. The condition of the 'if' statement asks whether \
any of these values is less than 18, which is true."
LICENSE = "Artistic-1.0"

PV = "2.03"

RPM_NAME = "perl-Quantum-Superpositions-2.03-1.17.noarch.rpm"
RPM_HASH = "d52f530adc0a5c2f3cef8b239552ac72e66f7d85846cbf5d9a21d25bbaedfc713af51327275d522597a0643ee1c2be352e73145b4b2d0908859ddebe7042af2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Quantum--Superpositions \
perl-Quantum--Superpositions--Conj \
perl-Quantum--Superpositions--Conj--True \
perl-Quantum--Superpositions--Disj \
perl-Quantum-Superpositions"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Multimethods"

inherit rpm
